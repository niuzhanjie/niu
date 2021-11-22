package com.example.demo.kafkatest;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer2 {

//    @KafkaListener(topics = "demo")
//    public void kafka(ConsumerRecord<?, ?> record) {
//        System.out.println("收到来自test的消息:" + record.value());
//    }

}

