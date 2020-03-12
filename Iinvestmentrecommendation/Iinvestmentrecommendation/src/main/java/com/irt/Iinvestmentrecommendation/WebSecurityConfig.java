package com.irt.Iinvestmentrecommendation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
				.antMatchers("/","/home")
				.access("hasRole('USER')")
				.and()
			.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/home")
				.and()
			.logout()
				.permitAll();
	}
	
	@Bean
	public UserDetailsService userDetailService() {
		UserDetails user =
				User.withDefaultPasswordEncoder()
					.username("John.Doe@anymail.com")
					.password("admin@123")
					.roles("USER")
					.build();
		return new InMemoryUserDetailsManager(user);
	}
}
