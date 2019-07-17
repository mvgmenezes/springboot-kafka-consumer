package com.mmenezes.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.mmenezes.kafka.model.User;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics = "Kafka_Example", groupId="group_id")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}
	
	//Usando para o JSON, com um container customizado.
	@KafkaListener(topics = "Kafka_Example_jsonss", groupId="group_jsonss", containerFactory="userKafkaListenerFactory")
	public void consumeJson(User user) {
		System.out.println("Consumed message: " + user);
	}
}
