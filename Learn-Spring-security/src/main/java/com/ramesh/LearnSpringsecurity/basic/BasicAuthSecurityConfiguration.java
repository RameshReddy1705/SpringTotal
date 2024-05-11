package com.ramesh.LearnSpringsecurity.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.websocket.Session;
@Configuration
public class BasicAuthSecurityConfiguration
{
	//ctr + shift + T ---->Search on SpringBootWebSecurityConfiguration
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth ->{
				auth.anyRequest().authenticated();
		});
		http.sessionManagement(
				Session ->Session.sessionCreationPolicy(
							SessionCreationPolicy.STATELESS)
							);
		//http.formLogin();
		http.httpBasic();
		http.csrf().disable();
		return http.build();
	}
}
