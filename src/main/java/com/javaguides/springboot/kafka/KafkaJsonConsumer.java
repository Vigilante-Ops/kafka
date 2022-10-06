package com.javaguides.springboot.kafka;

import com.javaguides.springboot.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonConsumer {
    @KafkaListener(topics = "javahuides",groupId = "myGroup")
    public void consume(User mssg)
    {
        System.out.println(mssg);
    }
}
