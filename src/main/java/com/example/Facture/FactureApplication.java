package com.example.Facture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FactureApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactureApplication.class, args);
	}
	@GetMapping("/path")
	public String Acceuil(){
		return "Bienvenus";
	}

}
