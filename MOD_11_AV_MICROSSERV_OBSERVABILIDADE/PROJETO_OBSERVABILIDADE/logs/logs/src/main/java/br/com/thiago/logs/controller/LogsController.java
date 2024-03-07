package br.com.thiago.logs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/logs")
public class LogsController {
    //pegeando os Logger
    private static final Logger LOGGER = LoggerFactory.getLogger(LogsController.class);

    @Value("${servico2.url:}")
    private String urlService2;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String mostraMensagem(){
        final double mensagem = Math.random();

        //vendo os níveis dos loggers, ele retorna no termimal run
        LOGGER.info("Gerei uma mensagem: {}", mensagem);


        if (urlService2.length() > 0){
            final String mensagemDeles = restTemplate.exchange(urlService2, HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
            }).getBody();
            return "Eu disse isso aqui: " + mensagem + " e eles disseram isso: (" + mensagemDeles + ")";
        }

        return "E eu deveria parar por aqui";
    }
}
