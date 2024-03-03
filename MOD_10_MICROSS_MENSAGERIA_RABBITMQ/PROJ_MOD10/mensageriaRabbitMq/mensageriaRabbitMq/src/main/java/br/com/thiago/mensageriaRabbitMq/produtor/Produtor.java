package br.com.thiago.mensageriaRabbitMq.produtor;

import br.com.thiago.mensageriaRabbitMq.service.ServicoRabbitMq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagens")
public class Produtor {
    @Autowired
    private ServicoRabbitMq servicoRabittMq;

    @PostMapping
    public void enviaMensagem(@RequestBody String mensagem){
        System.out.println("======= Enviando mensagem " + mensagem);

        servicoRabittMq.enviaMensagem(mensagem);
    }
}
