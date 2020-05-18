package com.rios.democloudkafka.event.producer;

import java.util.UUID;
import java.util.function.Supplier;

import com.rios.democloudkafka.dto.EventDTO;

import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class EventProducer {

    @Bean
    public Supplier<Message<EventDTO>> sendMessageToTopic2() {
        EventDTO eventDTO = new EventDTO();
        eventDTO.setPayload("payload");
        eventDTO.setTopicName("topic2");
        return () -> MessageBuilder
                        .withPayload(eventDTO)
                        .setHeader("spring.cloud.stream.sendto.destination", eventDTO.getTopicName())
                        .build();
	}
    
}