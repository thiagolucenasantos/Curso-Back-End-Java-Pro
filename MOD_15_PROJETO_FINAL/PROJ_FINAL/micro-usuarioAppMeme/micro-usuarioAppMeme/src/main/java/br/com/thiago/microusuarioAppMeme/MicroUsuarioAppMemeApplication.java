package br.com.thiago.microusuarioAppMeme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "br.com.thiago.microusuarioAppMeme.repositories")
@EnableDiscoveryClient
public class MicroUsuarioAppMemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroUsuarioAppMemeApplication.class, args);
	}

}
