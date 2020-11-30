package com.example.ehcacheintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EhcacheIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhcacheIntegrationApplication.class, args);
	}

}
