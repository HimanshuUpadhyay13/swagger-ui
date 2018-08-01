package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootExceptionReporter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.github.javafaker","com.example.demo.*"})
public class SwaggerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApiApplication.class, args);
	}
}
