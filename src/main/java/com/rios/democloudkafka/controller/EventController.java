package com.rios.democloudkafka.controller;

import com.rios.democloudkafka.dto.EventDTO;
import com.rios.democloudkafka.event.producer.EventProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @PostMapping("/start")
    public ResponseEntity<String> start(@RequestBody EventDTO eventDTO) {
        return new ResponseEntity<>("sent to topic 1", HttpStatus.OK);
    }

    @PostMapping("/topic2")
    public ResponseEntity<String> sendTopic2(@RequestBody EventDTO eventDTO) {

        return new ResponseEntity<>("sent to topic 1", HttpStatus.OK);
    }
    
}