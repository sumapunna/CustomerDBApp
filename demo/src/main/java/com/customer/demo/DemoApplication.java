package com.customer.demo;

import com.customer.demo.controller.CustomerController;
import jakarta.annotation.Resource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.Banner;

@SpringBootApplication
@ComponentScan(basePackageClasses= CustomerController.class)
//@ComponentScan("com.customer.demo.repository")
@EntityScan("com.customer.demo.model")
@EnableJpaRepositories("com.customer.demo.repository")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}


