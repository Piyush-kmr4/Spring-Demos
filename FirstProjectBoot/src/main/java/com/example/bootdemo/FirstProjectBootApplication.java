package com.example.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjectBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(FirstProjectBootApplication.class, args);
		
		Alien obj=(Alien)ctx.getBean(Alien.class);
		obj.code();
	}

}
