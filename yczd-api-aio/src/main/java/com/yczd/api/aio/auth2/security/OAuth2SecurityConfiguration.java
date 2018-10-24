package com.yczd.api.aio.auth2.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class OAuth2SecurityConfiguration extends WebSecurityConfigurerAdapter {
	//	@Autowired
	//	ClientDetailsService clientDetailsService;
	//
	//	@Autowired
	//	public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
	//		auth.inMemoryAuthentication()
	//				.withUser("bill").password("abc123").roles("ADMIN").and()
	//				.withUser("bob").password("abc123").roles("USER");
	//	}
	//
	//	@Override
	//	public void configure(HttpSecurity http) throws Exception {
	//		//		http.csrf().disable()
	//		//				.anonymous().disable()
	//		//				.authorizeRequests().antMatchers("/oauth/token").permitAll();
	//
	//		http.authorizeRequests().antMatchers("/login").permitAll()
	//				.anyRequest().authenticated().and().formLogin().permitAll();
	//	}
	//
	//	@Override
	//	@Bean
	//	public AuthenticationManager authenticationManagerBean() throws Exception {
	//		return super.authenticationManagerBean();
	//	}
	//
	//	//	@Bean
	//	//	public TokenStore tokenStore() {
	//	//		return new InMemoryTokenStore();
	//	//
	//	//	}
	//
	//	@Bean
	//	@Autowired
	//	public TokenStoreUserApprovalHandler userApprovalHandler(TokenStore tokenStore) {
	//		TokenStoreUserApprovalHandler handler = new TokenStoreUserApprovalHandler();
	//		handler.setTokenStore(tokenStore);
	//		handler.setRequestFactory(new DefaultOAuth2RequestFactory(clientDetailsService));
	//		handler.setClientDetailsService(clientDetailsService);
	//		return handler;
	//	}
	//
	//	@Bean
	//	@Autowired
	//	public ApprovalStore approvalStore(TokenStore tokenStore) throws Exception {
	//		TokenApprovalStore store = new TokenApprovalStore();
	//		store.setTokenStore(tokenStore);
	//		return store;
	//	}
}
