package com.ayaz.controller;

import com.ayaz.model.Notification;
import com.ayaz.producer.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NotificationController {

    @Autowired
    private NotificationProducer notificationProducer;

    public void sendQueue(Notification notification){
        notificationProducer.sendToQueue(notification);
    }
}
