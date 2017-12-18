package com.example.circlecihello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CircleCiHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircleCiHelloApplication.class, args);

		System.out.println("############");
		System.out.println("Hello World! and now testing auto builds");
		System.out.println("############");
	}
}
