package com.nakul.foodd_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class FooddSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FooddSpringApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();

	}

}
