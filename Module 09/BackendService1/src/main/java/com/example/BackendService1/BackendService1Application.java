package com.example.BackendService1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class BackendService1Application {
	public static void main(String[] args) {
		SpringApplication.run(BackendService1Application.class, args);
	}
	@RestController
	class BackendController {

		@GetMapping("/service/hello")
		public String hello() {
			return "Hello from Backend Service 1 (Port 9001)";
		}
	}
}