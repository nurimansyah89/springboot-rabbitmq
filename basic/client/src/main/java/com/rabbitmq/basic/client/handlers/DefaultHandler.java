package com.rabbitmq.basic.client.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.basic.client.components.Sender;

@RestController
public class DefaultHandler {
  
  @Autowired
  private Sender sender;
  
  @GetMapping("/")
  String helloWorld() {
    return "Hello World";
  }
  
  @GetMapping("/send")
  @ResponseBody
  String send(@RequestParam(required = false) String text) {
    String message = "Default message";
    if (text != null) message = text;
    sender.send(message);
    return "sended";
  }

}
