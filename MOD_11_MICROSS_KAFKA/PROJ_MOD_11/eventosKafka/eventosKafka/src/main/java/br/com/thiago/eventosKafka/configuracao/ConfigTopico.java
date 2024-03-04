package br.com.thiago.eventosKafka.configuracao;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ConfigTopico {
    @Value("${kafka.nome.topico}") // esse nome no Value para ser utilizado foi incluído no arquivo application.properties
    private String nomeTopico;
    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name(nomeTopico).partitions(1).replicas(1).build();
    }
}
