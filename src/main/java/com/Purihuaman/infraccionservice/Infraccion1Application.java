package com.Purihuaman.infraccionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Infraccion1Application {

	public static void main(String[] args) {
		SpringApplication.run(Infraccion1Application.class, args);
	}

}
