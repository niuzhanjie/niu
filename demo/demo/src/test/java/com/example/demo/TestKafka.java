package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.kafkatest.Consumer;
import com.example.demo.kafkatest.Product;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestKafka {

    @Autowired
    Product kafkaP;
    

    @Test
    public void contextLoads() {
        kafkaP.sendMessage("邪剑仙");
        while(true) {
        	
        }
             
    }
}

