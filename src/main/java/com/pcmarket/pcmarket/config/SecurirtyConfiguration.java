package com.pcmarket.pcmarket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurirtyConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.csrf().disable()
				.authorizeRequests()
				.antMatchers(HttpMethod.DELETE , "/api/**").hasAnyRole("MANAGER" , "ADMIN")
				.antMatchers(HttpMethod.GET , "/api/**").hasAnyRole("MANAGER" , "ADMIN" , "USER")
				.antMatchers("/api/**/**").hasRole("ADMIN")
				.anyRequest()
				.authenticated()
				.and()
				.httpBasic();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		
				.inMemoryAuthentication()
				.withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN")
				.and()
				.withUser("manager").password(passwordEncoder().encode("manager")).roles("MANAGER")
				.and()
				.withUser("user").password(passwordEncoder().encode("user")).roles("USER");
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
