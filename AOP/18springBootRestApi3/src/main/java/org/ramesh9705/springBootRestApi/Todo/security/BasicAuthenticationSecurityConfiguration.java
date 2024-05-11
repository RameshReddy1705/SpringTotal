package org.ramesh9705.springBootRestApi.Todo.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BasicAuthenticationSecurityConfiguration
{
		//Filter chain
		// authenticate all requests
		//basic authentication
		//disabling csrf
		//stateless rest api
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
//	{
//		return http
//				.authorizeHttpRequests(
//						auth -> 
//						auth
////						.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
//						.requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
//						.anyRequest().authenticated()
//						)
//				.httpBasic(Customizer.withDefaults())
//				.sessionManagement(
//						session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//						)
//				.csrf().disable()
//				.build();
//				
//	}
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		 
		http.authorizeHttpRequests(
						auth -> 
						auth
//						.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
						.requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
						.anyRequest().authenticated()
						);
		http.httpBasic(Customizer.withDefaults())
				.sessionManagement(
						session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
						);
		http.csrf().disable();
		http.headers().frameOptions().sameOrigin();
		return http.build();
				
	}
	
//	@Bean
//	public DataSource dataSource()
//	{
//		return new EmbeddedDatabaseBuilder()
//				.setType(EmbeddedDatabaseType.H2)
//				.addScript(JdbcDaoImpl.DEFAULT_USER_SCHEMA_DDL_LOCATION)
//				.build();
//	}
//	
	
	@Bean
	public UserDetailsService userDetailsService()
	{
//		UserDetails
		var userDetails =  User.withUsername("Ramesh")
		.password("{noop}9705")
		.roles("USER")
		.build();
		var adminDetails =  User.withUsername("Admin")
				.password("{noop}9705")
				.roles("ADMIN")
				.build();
		return new InMemoryUserDetailsManager(userDetails,adminDetails);
	}
	
}










