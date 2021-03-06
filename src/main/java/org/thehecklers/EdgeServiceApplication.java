package org.thehecklers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class EdgeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServiceApplication.class, args);
	}
}
