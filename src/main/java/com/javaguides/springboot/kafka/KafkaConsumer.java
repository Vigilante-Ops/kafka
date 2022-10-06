package com.javaguides.springboot.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//@Service
public class KafkaConsumer {

   // @KafkaListener(topics = "javahuides",groupId = "myGroup")
    public void consume(String mssg)
    {
        System.out.println("consumed mssg"+mssg);
    }

}
