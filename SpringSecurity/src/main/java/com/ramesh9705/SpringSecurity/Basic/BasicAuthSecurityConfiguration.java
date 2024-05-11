package com.ramesh9705.SpringSecurity.Basic;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableMethodSecurity(jsr250Enabled = true, securedEnabled = true)
public class BasicAuthSecurityConfiguration
{
	@Bean
	SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth->{
			auth
//			.requestMatchers("/users").hasRole("USER")
//			.requestMatchers("/admin/*").hasRole("USER")
			.anyRequest().authenticated();
		});
		http.sessionManagement(
				session-> session.sessionCreationPolicy(
						SessionCreationPolicy.STATELESS)
				
				);
//		http.formLogin();
		http.httpBasic();
		http.csrf().disable();
		http.headers().frameOptions().sameOrigin();
		return http.build();
	}
//	@Bean
//	public UserDetailsService userDetailsService()
//	{
//		var userDetails=User.withUsername("Ramesh")
//			.password("{noop}9705")
//			.roles("USER")
//			.build();
//		var adminDetails=User.withUsername("admin")
//				.password("{noop}9705")
//				.roles("ADMIN")
//				.build();
//		return new InMemoryUserDetailsManager(userDetails,adminDetails);
//		
//	}
	@Bean
	public DataSource dataSource()
	{
		return new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
				.addScript(JdbcDaoImpl.DEFAULT_USER_SCHEMA_DDL_LOCATION)
				.build();
	}
	@Bean
	public UserDetailsService userDetailsService(DataSource dataSource)
	{
		var userDetails=User.withUsername("Ramesh")
//			.password("{noop}9705")
				.password("9705")
			.passwordEncoder(str -> passwordEncoder().encode(str))
			.roles("USER")
			.build();
		var adminDetails=User.withUsername("admin")
//				.password("{noop}9705")
				.password("9705")
				.passwordEncoder(str -> passwordEncoder().encode(str))
				.roles("ADMIN","USER")
				.build();
		var jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
		jdbcUserDetailsManager.createUser(userDetails);
		jdbcUserDetailsManager.createUser(adminDetails);
		return jdbcUserDetailsManager;
		
	}
	@Bean
	public BCryptPasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}