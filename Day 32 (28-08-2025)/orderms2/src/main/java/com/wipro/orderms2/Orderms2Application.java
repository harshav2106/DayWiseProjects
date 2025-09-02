package com.wipro.orderms2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Orderms2Application {

	public static void main(String[] args) {
		SpringApplication.run(Orderms2Application.class, args);
	}

}
