package com.yczd.api.aio.auth2.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration
		extends AuthorizationServerConfigurerAdapter {
	//	private static final String YCZD_MINI_REALM = "YCZD_MINI_OAUTH_REALM";
	//
	//	@Autowired
	//	@Qualifier("authenticationManagerBean")
	//	private AuthenticationManager authenticationManager;
	//
	//	@Autowired
	//	TokenStore tokenStore;
	//
	//	@Autowired
	//	UserDetailsService userDetailsService;
	//
	//	//	@Autowired
	//	//	UserApprovalHandler userApprovalHandler;
	//
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		//		clients.inMemory()
		//				.withClient("yczd-mini-client")
		//				.authorizedGrantTypes("password", "authorization_code", "refresh_token", "implicit")
		//				.authorities("ROLE_CLIENT", "ROLE_TRUSTED_CLIENT")
		//				.scopes("read", "write", "trust")
		//				.secret("secret")
		//				.accessTokenValiditySeconds(120)
		//				.refreshTokenValiditySeconds(600);
		clients.inMemory()
				.withClient("sampleclient")
				.authorizedGrantTypes("implicit")
				.scopes("read")
				.autoApprove(true).and()
				.withClient("yczd-mini-client")
				.authorizedGrantTypes("password", "authorization_code", "refresh_token", "implicit")
				.scopes("read", "write", "trust")
				.secret("{noop}123456")
				.accessTokenValiditySeconds(120)
				.refreshTokenValiditySeconds(600).and()
				.withClient("test")
				.authorizedGrantTypes("password", "refresh_token")
				.scopes("read", "write")
				.secret("{noop}123456")
				.accessTokenValiditySeconds(120)
				.refreshTokenValiditySeconds(600).and()
				.withClient("test1")
				.authorizedGrantTypes("password", "authorization_code", "refresh_token", "implicit")
				.secret("{noop}secret")
				.scopes("all");
	}
	//
	//	@Override
	//	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
	//		//		endpoints.tokenStore(tokenStore).userApprovalHandler(userApprovalHandler)
	//		//				.authenticationManager(authenticationManager);
	//		endpoints.tokenStore(tokenStore())
	//				.authenticationManager(authenticationManager)
	//				.userDetailsService(userDetailsService);
	//	}
	//
	//	@Override
	//	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
	//
	//		security.tokenKeyAccess("permitAll()")
	//				.checkTokenAccess("isAuthenticated()");
	//
	//		//security.realm(YCZD_MINI_REALM + "/client");
	//	}
	//
	//	@Bean
	//	public TokenStore tokenStore() {
	//		return new InMemoryTokenStore();
	//	}

}
