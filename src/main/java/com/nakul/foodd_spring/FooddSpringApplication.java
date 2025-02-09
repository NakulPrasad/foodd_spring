package com.nakul.foodd_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nakul.demo.Demo;

@SpringBootApplication
public class FooddSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FooddSpringApplication.class, args);
		// var demo = new Demo();
		System.out.println(Demo.getWelcomeMessage());

	}

}
