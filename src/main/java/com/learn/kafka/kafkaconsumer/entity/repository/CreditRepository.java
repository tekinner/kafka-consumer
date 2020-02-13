package com.learn.kafka.kafkaconsumer.entity.repository;

import com.learn.kafka.kafkaconsumer.entity.CreditEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends JpaRepository<CreditEntity,String> {

}
