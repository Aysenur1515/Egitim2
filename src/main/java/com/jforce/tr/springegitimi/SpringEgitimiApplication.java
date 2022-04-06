package com.jforce.tr.springegitimi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jforce.tr"})
public class SpringEgitimiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEgitimiApplication.class, args);
	}

}
