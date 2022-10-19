package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String name = "obinna"

		System.out.printLn(name);

		Integer age ="20"
		System.out.printIn(age + 5);
	}

}
