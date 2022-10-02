package com.narekm.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "test_topic",groupId = "test")
    void listener(String data){
        System.out.println("Listener received "+ "🫡 "+ data);
    }
}
