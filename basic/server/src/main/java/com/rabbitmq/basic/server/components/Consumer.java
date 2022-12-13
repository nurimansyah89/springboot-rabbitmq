package com.rabbitmq.basic.server.components;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
  
  @RabbitListener(queues = {"${queue.name}"})
  public void receive(@Payload String fileBody) {
    System.out.println("Message: " + fileBody);
  }

}
