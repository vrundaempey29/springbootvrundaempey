package com.vrunda.spring.boot.springbootvrundaempey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//The above annotation is equivalent to @Configuration @ContextComponentScan and @EnableAutoConfiguration
public class SpringbootvrundaempeyApplication {


	/*We will work on a small use case
	* 1. Create a Dao class and a ProductService class and inject ProductDao into the Service using
	* Spring Boot. We will see a standalone application running end to end*/
	public static void main(String[] args) {
		SpringApplication.run(SpringbootvrundaempeyApplication.class, args);
	}

}
