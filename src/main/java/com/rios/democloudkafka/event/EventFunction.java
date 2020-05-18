package com.rios.democloudkafka.event;

import java.util.function.Function;

import com.rios.democloudkafka.dto.EventDTO;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class EventFunction {
    
    public Function<EventDTO, Message<EventDTO>> process() {
        return eventDTO -> {
            return MessageBuilder.withPayload(eventDTO)
            .setHeader(KafkaHeaders.TOPIC, "topic2")
            .build();
        };
    }
}