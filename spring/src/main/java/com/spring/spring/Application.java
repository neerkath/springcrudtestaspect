package com.spring.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass=true) 
@OpenAPIDefinition
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
	}

}
