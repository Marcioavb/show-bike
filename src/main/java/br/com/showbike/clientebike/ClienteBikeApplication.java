package br.com.showbike.clientebike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClienteBikeApplication {
	
	@GetMapping
	public String getHomeTeste() {
		return "Show Bike Teste ok";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClienteBikeApplication.class, args);
	}
}
