package com.kevinchege47.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "test1",groupId = "foo")
    void listener(String data){
        System.out.println("listener received"+data+":)");
    }
}
