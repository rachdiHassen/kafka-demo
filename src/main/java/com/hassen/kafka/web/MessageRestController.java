package com.hassen.kafka.web;

import com.hassen.kafka.payload.Student;
import com.hassen.kafka.producer.KafkaJsonProducer;
import com.hassen.kafka.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageRestController {
    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;
    @PostMapping
    public ResponseEntity<String> sendMessage(
            @RequestBody String message
    ){
        kafkaProducer.publishMessage(message);
        return ResponseEntity.ok("Message sent succefully");
    }

    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(
            @RequestBody Student message
    ){
        kafkaJsonProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent succefully");
    }
}
