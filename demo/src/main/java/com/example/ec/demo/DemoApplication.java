package com.example.ec.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {
	
/**With SpringBoot we are no longer writing code that has to be packaged into a war and then deployed
The web server is deployed in our application
Adding @SpringBootApplication annotation to this class with the main method tells Java and SpringBoot
where our microservice starts
**/
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
