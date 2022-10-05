package com.javaguides.springboot.controller;

import com.javaguides.springboot.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController
{
    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> sendMssg(@RequestParam("mssg") String msg)
    {
        kafkaProducer.sendMssg(msg);
        return ResponseEntity.ok(msg);
    }

}
