package br.com.thiago.mensageriaRabbitMq.consumidor;

import br.com.thiago.mensageriaRabbitMq.configuracao.ConfiguracaoRabbitMq;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = ConfiguracaoRabbitMq.NOME_FILA)
public class Consumidor {
    @RabbitHandler
    public void consumirMensagem(String mensagem){
        System.out.println("============= RECEBENDO MENSAGEM =============");

        System.out.println(mensagem);

        System.out.println("============= FIM MENSAGEM =============");
    }
}
