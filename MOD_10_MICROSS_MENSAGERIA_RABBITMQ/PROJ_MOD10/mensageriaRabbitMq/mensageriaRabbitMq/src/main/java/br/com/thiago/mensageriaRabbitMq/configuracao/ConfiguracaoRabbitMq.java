package br.com.thiago.mensageriaRabbitMq.configuracao;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracaoRabbitMq {
    public static final String NOME_FILA = "fila";
    public static final String NOME_EXCHANGE = "exchange";
    public static final String NOME_ROTA = "rota.#";

    @Bean
    public Queue queue() {
        return new Queue(NOME_FILA, false);
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(NOME_EXCHANGE);
    }

    @Bean
    public Binding binding(Queue queue, TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(NOME_ROTA);
    }

}
