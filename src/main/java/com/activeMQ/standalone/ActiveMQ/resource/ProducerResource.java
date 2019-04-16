package com.activeMQ.standalone.ActiveMQ.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

import javax.jms.Queue;


@RestController
@RequestMapping("/rest")
public class ProducerResource {

    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private Queue queue;

    @RequestMapping(value = "/{message}", method = RequestMethod.GET)
    public String publish(@PathVariable("message") final String message1){
        jmsTemplate.convertAndSend(queue, message1);
        String msg = message1 + " Published Successfully";
        return msg;
    }
}