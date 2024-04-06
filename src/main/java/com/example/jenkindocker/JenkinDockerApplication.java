package com.example.jenkindocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinDockerApplication {

	@GetMapping("/test")
	public String test() {
		return "Test Xing Liu";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinDockerApplication.class, args);
	}

}
