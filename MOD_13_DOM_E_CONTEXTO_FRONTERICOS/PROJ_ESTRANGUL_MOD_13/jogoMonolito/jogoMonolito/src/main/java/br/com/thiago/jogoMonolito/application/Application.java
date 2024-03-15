package br.com.thiago.jogoMonolito.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.commons.httpclient.HttpClientConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.thiago.jogoMonolito.repositorios")
@EnableFeignClients(basePackages = "br.com.thiago.jogoMonolito.feign")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
