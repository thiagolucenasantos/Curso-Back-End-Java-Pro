package br.com.thiago.zookeeperserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient//Anotação que faz com que ela possa ser descoberta e descubra outras aplicações também
@SpringBootApplication
public class ZookeeperServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZookeeperServerApplication.class, args);
	}

}
