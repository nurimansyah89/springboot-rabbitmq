package com.rabbitmq.rpc.client.handlers;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultHandler {
  
  @Autowired
  private RabbitTemplate rabbitTemplate;

  @Autowired
  private DirectExchange directExchange;

  @GetMapping("/")
  @ResponseBody
  String helloWorld(@RequestParam(required = false) String text) {
    String message = "default text";
    if (text != null) message = text;
    String response = (String) rabbitTemplate.convertSendAndReceive(directExchange.getName(), "example", message);
    return "Hello World and message: " + response;
  }

}
