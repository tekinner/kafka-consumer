package com.learn.kafka.kafkaconsumer.kafka_consumer;

import com.google.gson.Gson;
import com.learn.kafka.kafkaconsumer.entity.CreditEntity;
import com.learn.kafka.kafkaconsumer.entity.repository.CreditRepository;
import com.learn.kafka.kafkaconsumer.model.CreditModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private Gson gson;

    @Autowired
    private CreditRepository   creditRepository;

    @KafkaListener(topics = "hi_ertekin", groupId = "rewardService2")
    public void kafkaConsumer(String message){
        System.out.println("*************************"+message);
        CreditModel creditModel = gson.fromJson(message, CreditModel.class);
        CreditEntity creditEntity = new CreditEntity(creditModel);

        creditRepository.save(creditEntity);

    }


}
