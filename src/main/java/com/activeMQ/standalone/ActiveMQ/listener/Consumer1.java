package com.activeMQ.standalone.ActiveMQ.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer1 {

    @JmsListener(destination = "standalone.queue")
    public void consume(String message){
    System.out.println("The Message from 1 is " + message);
    }
}



