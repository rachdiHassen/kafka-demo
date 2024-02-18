package com.hassen.kafka.consumer;

import com.hassen.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "hassenTopic",groupId = "myGroup")
    public void consumeMsg(String msg){
        log.info(String.format(" message received from hassen topic ::%s", msg));
    }
    @KafkaListener(topics = "hassenTopic",groupId = "myGroup")
    public void consumeJsonMsg(Student student){
        log.info(String.format(" message received from hassen topic ::%s", student.toString()));
    }
}
