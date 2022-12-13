package com.rabbitmq.rpc.client.configurations;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConfig {
  
  @Value("${queue.name}")
  private String queueName;

  @Value("${xchange.name}")
  private String directXChangeName;

  @Bean
  Queue queue() {
    return new Queue(queueName);
  }

  @Bean
  DirectExchange directExchange() {
    return new DirectExchange(directXChangeName);
  }

  @Bean
  Binding binding(DirectExchange exchange, Queue queue) {
    return BindingBuilder.bind(queue).to(exchange).with("example");
  }

}
