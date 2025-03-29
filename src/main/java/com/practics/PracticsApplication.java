package com.practics;

import com.practics.aop.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticsApplication {



	public static void main(String[] args) {
		SpringApplication.run(PracticsApplication.class, args);
	}



}
