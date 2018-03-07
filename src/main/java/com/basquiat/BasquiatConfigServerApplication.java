package com.basquiat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BasquiatConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasquiatConfigServerApplication.class, args);
	}
}
