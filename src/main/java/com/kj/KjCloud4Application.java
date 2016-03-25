package com.kj;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@SpringBootApplication
@EnableOAuth2Sso
public class KjCloud4Application extends WebSecurityConfigurerAdapter {
	public static void main(String[] args) {
		SpringApplication.run(KjCloud4Application.class, args);
	}
}
