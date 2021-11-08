package com.example.Aula0017_Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Aula0017SpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(Aula0017SpringApplication.class, args);
	}

	@GetMapping
	public String oiJovem(){
		return "Oi jovem, deu bom agora!!!";
	}


}
