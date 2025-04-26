package com.sringboot.securityexample_htpps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SecurityexampleHtppsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityexampleHtppsApplication.class, args);
	}

	@GetMapping("/ping")
	public ResponseEntity<String> ping() {
		return ResponseEntity.ok("ping");
	}

}
