package com.yczd.api.aio.auth2;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.approval.ApprovalStore;
import org.springframework.security.oauth2.provider.approval.TokenApprovalStore;
import org.springframework.security.oauth2.provider.approval.TokenStoreUserApprovalHandler;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.request.DefaultOAuth2RequestFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import com.yczd.api.aio.auth2.service.impl.Auth2UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class Auth2SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Bean
	@ConfigurationProperties(value = "yczd.auth2.datasource")
	public DataSource auth2DataSource() {
		return DataSourceBuilder.create().driverClassName("com.mysql.jdbc.Driver")
				.url("jdbc:mysql://10.207.30.152:3306/yczd_mini").password("admin").username("root").build();
	}

	//
	//	@Autowired
	//	UserDetailsService jdbcUserDetailsService;
	//
	@Bean
	public ClientDetailsService clientDetailsService() {
		return new JdbcClientDetailsService(auth2DataSource());
	}

	@Bean
	public UserDetailsService userDetailsService() {
		return new Auth2UserDetailsServiceImpl();
	}

	@Autowired
	public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService()).and();
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
				.anonymous().disable()
				.authorizeRequests().antMatchers("/oauth/token").permitAll().and()
				.userDetailsService(userDetailsService());

	}

	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Bean
	public TokenStore tokenStore() {
		return new JdbcTokenStore(auth2DataSource());

	}

	@Bean
	@Autowired
	public TokenStoreUserApprovalHandler userApprovalHandler(TokenStore tokenStore) {
		TokenStoreUserApprovalHandler handler = new TokenStoreUserApprovalHandler();
		handler.setTokenStore(tokenStore);
		handler.setRequestFactory(new DefaultOAuth2RequestFactory(clientDetailsService()));
		handler.setClientDetailsService(clientDetailsService());
		return handler;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsServiceBean());
	}

	@Bean
	@Autowired
	public ApprovalStore approvalStore(TokenStore tokenStore) throws Exception {
		TokenApprovalStore store = new TokenApprovalStore();
		store.setTokenStore(tokenStore);
		return store;
	}
}
