package com.learn.kafka.kafkaconsumer.service;

import com.google.gson.Gson;
import com.learn.kafka.kafkaconsumer.entity.CreditEntity;
import com.learn.kafka.kafkaconsumer.entity.repository.CreditRepository;
import com.learn.kafka.kafkaconsumer.model.CreditModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditConsumer {

    @Autowired
    private CreditRepository creditRepository;

    @Autowired
    private Gson gson;

    @RequestMapping(value = "/consumer", method = RequestMethod.GET)
    public Object consumer(){

        return creditRepository.findAll();

    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object healthCheck() {

        return "<h1>hello, you're on the CONSUMER service...it's working..</h1>";
    }

}
