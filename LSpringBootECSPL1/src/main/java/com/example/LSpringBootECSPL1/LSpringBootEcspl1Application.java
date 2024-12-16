package com.example.LSpringBootECSPL1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LSpringBootEcspl1Application {

	public static void main(String[] args) {
		SpringApplication.run(LSpringBootEcspl1Application.class, args);
	}
	 @RestController
	    public static class HelloController {
	        @GetMapping("/")
	        public String hello() {
	            return "Hello, Spring Boot!";
	        }
	    }

}
