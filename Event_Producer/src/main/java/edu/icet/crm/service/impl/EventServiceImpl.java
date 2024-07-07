package edu.icet.crm.service.impl;

import edu.icet.crm.producer.KafkaProducer;
import edu.icet.crm.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;

public class EventServiceImpl implements EventService {
    @Autowired
    private KafkaProducer kafkaProducer;

    public void placeEvent(String eventId) {
        //process Events activities
        //Like generate orders , discount, generate invoice

        //send Email/Message

    }
}
