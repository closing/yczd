package com.yczd.api.aio.auth2;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.approval.ApprovalStore;
import org.springframework.security.oauth2.provider.approval.JdbcApprovalStore;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.code.AuthorizationCodeServices;
import org.springframework.security.oauth2.provider.code.JdbcAuthorizationCodeServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {
	private static final String YCZD_REALM = "YCZD_OAUTH_REALM";

	@Bean
	//@ConfigurationProperties(prefix = "yczd.auth2.datasource")
	public DataSource auth2DataSource() {
		return DataSourceBuilder.create()
				.driverClassName("com.mysql.jdbc.Driver")
				.url("jdbc:mysql://localhost:3306/yczd_mini").password("admin").username("root")
				.build();
	}

	@Bean
	public ClientDetailsService clientDetailsService() {
		return new JdbcClientDetailsService(auth2DataSource());
	}

	@Bean
	public ApprovalStore approvalStore() {
		return new JdbcApprovalStore(auth2DataSource());
	}

	// authorization_code
	@Bean
	public AuthorizationCodeServices authorizationCodeServices() {
		return new JdbcAuthorizationCodeServices(auth2DataSource());
	}

	@Bean
	public TokenStore tokenStore() {
		return new JdbcTokenStore(auth2DataSource());
	}
	// password
	@Autowired
	@Qualifier("authenticationManagerBean")
	private AuthenticationManager authenticationManager;
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.withClientDetails(clientDetailsService());
		;
	}

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.approvalStore(approvalStore())
				.tokenStore(tokenStore())
				.authorizationCodeServices(authorizationCodeServices())
		//.userApprovalHandler(userApprovalHandler)
		.authenticationManager(authenticationManager)
		;

	}

	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {

		security.realm(YCZD_REALM + "/client");
		security.allowFormAuthenticationForClients();
		security.checkTokenAccess("permitAll()");
	}

}
