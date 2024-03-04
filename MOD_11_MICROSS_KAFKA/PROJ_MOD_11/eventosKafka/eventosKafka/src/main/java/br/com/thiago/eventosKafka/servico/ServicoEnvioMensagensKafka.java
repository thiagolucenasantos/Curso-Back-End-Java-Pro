package br.com.thiago.eventosKafka.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ServicoEnvioMensagensKafka {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Value("${kafka.nome.topico}")
    private String nomeTopico;

    public void enviarMensagem(String mensagem){
        System.out.println("========== Enviando mensagem" + mensagem);

        kafkaTemplate.send(nomeTopico, mensagem);

    }
}
