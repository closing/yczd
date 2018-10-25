package com.yczd.api.aio.tools;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import com.yczd.api.aio.auth2.model.Auth2TokenInfo;

public class Auth2RestClient {

	public static final String REST_SERVICE_URI = "http://localhost:8080";

	public static final String AUTH_SERVER_URI = "http://localhost:8080/oauth/token";

	public static final String PASSWORD_GRANT = "?grant_type=password&username=yczd&password=password";

	public static final String ACCESS_TOKEN = "?access_token=";

	/*
	 * Prepare HTTP Headers.
	 */
	private static HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		return headers;
	}

	/*
	 * Add HTTP Authorization header, using Basic-Authentication to send client-credentials.
	 */
	private static HttpHeaders getHeadersWithClientCredentials() {
		String plainClientCredentials = "yczd-mini-client:secret";
		String bcryptClientCredentials = new String(Base64.encodeBase64(plainClientCredentials.getBytes()));

		HttpHeaders headers = getHeaders();
		headers.add("Authorization", "Basic " + bcryptClientCredentials);
		return headers;
	}

	/*
	 * Send a POST request [on /oauth/token] to get an access-token, which will then be send with each request.
	 */
	@SuppressWarnings({ "unchecked" })
	private static Auth2TokenInfo sendTokenRequest() {
		RestTemplate restTemplate = new RestTemplate();

		HttpEntity<String> request = new HttpEntity<String>(getHeadersWithClientCredentials());
		ResponseEntity<Object> response = restTemplate.exchange(AUTH_SERVER_URI + PASSWORD_GRANT, HttpMethod.POST,
				request, Object.class);
		LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) response.getBody();
		Auth2TokenInfo tokenInfo = null;

		if (map != null) {
			tokenInfo = new Auth2TokenInfo();
			tokenInfo.setAccess_token((String) map.get("access_token"));
			tokenInfo.setToken_type((String) map.get("token_type"));
			tokenInfo.setRefresh_token((String) map.get("refresh_token"));
			tokenInfo.setExpires_in((Integer) map.get("expires_in"));
			tokenInfo.setScope((String) map.get("scope"));
			System.out.println(tokenInfo);
		} else {
			System.out.println("No user exist");

		}
		return tokenInfo;
	}

	/*
	 * Send a GET request to get list of all shops.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void listAllShops(Auth2TokenInfo tokenInfo) {
		Assert.notNull(tokenInfo, "Authenticate first please...");

		System.out.println("\nTesting : listAllShops API");
		RestTemplate restTemplate = new RestTemplate();

		HttpEntity<String> request = new HttpEntity<String>(getHeaders());
		ResponseEntity<List> response = restTemplate.exchange(
				REST_SERVICE_URI + "/v1/shops" + ACCESS_TOKEN + tokenInfo.getAccess_token(),
				HttpMethod.GET, request, List.class);
		List<LinkedHashMap<String, Object>> shopsMap = (List<LinkedHashMap<String, Object>>) response.getBody();

		if (shopsMap != null) {
			for (LinkedHashMap<String, Object> map : shopsMap) {
				System.out.println("Shop : id=" + map.get("shopId") + ", Name=" + map.get("shopName") );
				;
			}
		} else {
			System.out.println("Shop does not exist");
		}
	}

	/**
	 *
	 * -h --help
	 *
	 * @param args
	 */
	public static void main(String args[]) {

		Auth2TokenInfo tokenInfo = sendTokenRequest();
		if (args.length == 0) {

		}

		listAllShops(tokenInfo);

	}
}
