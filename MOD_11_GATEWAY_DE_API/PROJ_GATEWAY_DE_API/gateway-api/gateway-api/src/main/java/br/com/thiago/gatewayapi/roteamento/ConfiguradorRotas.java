package br.com.thiago.gatewayapi.roteamento;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfiguradorRotas {
    @Bean
    public RouteLocator minhasRotas(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("get-route", p -> p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("oi", "THIAGO"))
                        .uri("https://httpbin.org/"))
                .route("thiago-host", p -> p
                        .host("*thiago.com.br")
                        .filters(f -> f.addRequestHeader("Origem", "Site de Thiago"))
                        .uri("https://httpbin.org/"))

                .build();
    }
}
