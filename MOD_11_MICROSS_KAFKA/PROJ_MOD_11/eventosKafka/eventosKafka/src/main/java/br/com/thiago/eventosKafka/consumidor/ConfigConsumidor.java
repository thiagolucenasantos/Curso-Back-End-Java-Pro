package br.com.thiago.eventosKafka.consumidor;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;

@Configuration
public class ConfigConsumidor {
    @RetryableTopic(attempts = "2") // anotação referente ao DLT
    @KafkaListener(topics = "${kafka.nome.topico}", groupId = "group") // precisa do group se não ele não funcionará
    public void consumidorMensagem(String mensagem){
        if (mensagem.contains("DLT")){
            throw new IllegalArgumentException("Teste de DLT");
        }

        System.out.println("========== RECEBENDO MENSAGEM ==========");

        System.out.println("========== " + mensagem);

        System.out.println("========== FIM DA MENSAGEM ==========");
    }
    @DltHandler
    public void consumirMensagemDLT(String mensagem){
        System.out.println("========== RECEBENDO MENSAGEM ==========");

        System.out.println("========== " + mensagem);

        System.out.println("========== FIM DA MENSAGEM ==========");

    }
}
