package com.jane.ws.api.EurekaResourceServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class EurekaResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaResourceServerApplication.class, args);
	}

}
