package com.example.BackendService2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class BackendService2Application {
	public static void main(String[] args) {
		SpringApplication.run(BackendService2Application.class, args);
	}

	@RestController
	class BackendController {

		@GetMapping("/service/hello")
		public String hello() {
			return "Hello from Backend Service 2 (Port 9002)"; // Change this message
		}
	}
}