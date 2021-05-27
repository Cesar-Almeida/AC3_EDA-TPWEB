package br.com.bandtec.ac3veiculo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Ac3VeiculoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ac3VeiculoApplication.class, args);
	}

}
