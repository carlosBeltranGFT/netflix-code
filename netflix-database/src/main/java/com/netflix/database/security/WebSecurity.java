package com.netflix.database.security;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN").and().withUser("user")
				.password(passwordEncoder().encode("user")).roles("USER");
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((authz) -> authz 
				.antMatchers(HttpMethod.GET).permitAll() 
				.antMatchers(HttpMethod.POST, "/").hasRole("USER") 
				.antMatchers(HttpMethod.PUT, "/").hasRole("USER") 
				.antMatchers(HttpMethod.PATCH, "/").hasRole("USER") 
				.antMatchers(HttpMethod.DELETE, "/").hasRole("ADMIN") ) 
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) 
		.and() 
		.csrf().disable() .httpBasic(Customizer.withDefaults());
				
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}