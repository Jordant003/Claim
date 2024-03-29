package com.rep.RealEstateProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.rep")
public class RealEstateProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealEstateProjectApplication.class, args);
	}

}
