package com.keycloak.userkeyclock;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserKeyclockApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserKeyclockApplication.class, args);
	}

	/*@Bean
	public KeycloakConfigResolver KeycloakConfigResolver(){
		return new KeycloakSpringBootConfigResolver();
	}*/

}
