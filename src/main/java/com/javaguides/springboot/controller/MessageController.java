package com.javaguides.springboot.controller;

import com.javaguides.springboot.kafka.KafkaJsonProducer;
import com.javaguides.springboot.kafka.KafkaProducer;
import com.javaguides.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController
{
    @Autowired
    private KafkaProducer kafkaProducer;
    @Autowired
    private KafkaJsonProducer kafkaJsonProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> sendMssg(@RequestParam("mssg") String msg)
    {
        kafkaProducer.sendMssg(msg);
        return ResponseEntity.ok(msg);
    }
    @PostMapping("/publishjson")
    public ResponseEntity<User> sendMssgjson(@RequestBody User user)
    {
        kafkaJsonProducer.sendMessage(user);
        return ResponseEntity.ok(user);
    }

}
