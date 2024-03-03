package br.com.thiago.mensageriaRabbitMq.service;

import br.com.thiago.mensageriaRabbitMq.configuracao.ConfiguracaoRabbitMq;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoRabbitMq {
    //utilizaremos o serviço rabbitTemplate, ele abstrai os dados e envia para a fila de forma automática e autoconfigurável
    @Autowired
    private RabbitTemplate rabbitTemplate;
    public void enviaMensagem(String mensagem){
        rabbitTemplate.convertAndSend(ConfiguracaoRabbitMq.NOME_EXCHANGE, "rota.mensagem", mensagem);
    }
}
