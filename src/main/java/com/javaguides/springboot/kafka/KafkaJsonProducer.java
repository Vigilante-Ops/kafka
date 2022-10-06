package com.javaguides.springboot.kafka;

import com.javaguides.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonProducer
{
    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(User user)
    {
        Message<User> msg= MessageBuilder.withPayload(user).setHeader(KafkaHeaders.TOPIC,"javahuides").build();
        kafkaTemplate.send(msg);
    }
}
