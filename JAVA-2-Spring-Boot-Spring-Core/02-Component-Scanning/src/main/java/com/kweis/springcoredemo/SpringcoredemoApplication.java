package com.kweis.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//adding base packages that you want to include in your program
//@SpringBootApplication(
//		scanBasePackages =  {
//				"com.kweis.springcoredemo",
//				"com.kweis.util"
//		}
//)

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
