package br.com.bandtec.ac3veiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Ac3VeiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ac3VeiculosApplication.class, args);
	}

}
