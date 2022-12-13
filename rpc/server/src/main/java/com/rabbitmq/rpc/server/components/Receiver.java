package com.rabbitmq.rpc.server.components;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
  
  @RabbitListener(queues = {"${queue.name}"})
  public String helloWorld(@Payload String fileBody) {
    return "Are you send: " + fileBody + "?";
  }

}
