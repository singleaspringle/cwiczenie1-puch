package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.demo")
@ComponentScan(basePackages = { "com.example.demo.*" })
@EntityScan("com.example.demo.model")
public class main {

	public static void main(String[] args) {
		SpringApplication.run(main.class, args);
	}
}