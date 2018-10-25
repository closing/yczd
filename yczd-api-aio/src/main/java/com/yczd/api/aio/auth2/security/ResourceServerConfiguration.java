package com.yczd.api.aio.auth2.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	private static final String YCZD_RESOURCE_ID = "yczd_api";

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources.resourceId(YCZD_RESOURCE_ID).stateless(false);

	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.anonymous().disable()
				.requestMatchers().antMatchers("/v1/shops/**")
				.and().authorizeRequests()
				.antMatchers("/v1/shops/**").access("hasAnyRole('SHOP','ADMIN')")
				.and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());

	}
}
