package edu.cibertec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApiSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSampleApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hola Mundo!!!";
	}
	
}
