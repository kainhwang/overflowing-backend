package com.church.overflowing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OverflowingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OverflowingApplication.class, args);
	}
}

