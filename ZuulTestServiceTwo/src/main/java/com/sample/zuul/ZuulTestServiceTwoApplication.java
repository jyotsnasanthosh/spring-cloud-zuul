package com.sample.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZuulTestServiceTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulTestServiceTwoApplication.class, args);
	}
}
