package com.wipro.paymentms2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Paymentms2Application {

	public static void main(String[] args) {
		SpringApplication.run(Paymentms2Application.class, args);
	}

}
