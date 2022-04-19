package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class Controller {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;


    @PostMapping
    public void publish(@RequestBody String message){
        kafkaTemplate.send("MyTopic", message);
    }

}
