package org.ramesh9705.SpringSecurity02.Basic;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
//@Configuration
public class BasicAuthConfiguration
{
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests(
						auth -> {
							auth.anyRequest().authenticated();
						});
		
		http.sessionManagement(
						session -> 
							session.sessionCreationPolicy(
									SessionCreationPolicy.STATELESS)
						);
		
		//http.formLogin();
		http.httpBasic();
		
		http.csrf(csrf -> csrf.disable());
		http.headers().frameOptions().sameOrigin();
		
		return http.build();
	}
	
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
		var user=User.withUsername("Ramesh")
//				.password("{noop}9705")
				.password("9705")
				.passwordEncoder(str->PasswordEncoder().encode(str))
				.roles("USER")
				.build();
		var admin=User.withUsername("admin")
//				.password("{noop}9705")
				.password("9705")
				.passwordEncoder(str->PasswordEncoder().encode(str))
				.roles("ADMIN")
				.build();
		var jdbcUserDetailsManager= new JdbcUserDetailsManager(dataSource);
			jdbcUserDetailsManager.createUser(user);
			jdbcUserDetailsManager.createUser(admin);
		return jdbcUserDetailsManager;
	}
	@Bean
	public BCryptPasswordEncoder PasswordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
}