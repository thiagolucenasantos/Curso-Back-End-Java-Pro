package br.com.thiago.estrangul.monolito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.thiago.estrangul.monolito.repositorys")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
