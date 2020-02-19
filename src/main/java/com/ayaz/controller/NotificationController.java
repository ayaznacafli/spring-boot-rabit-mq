package com.ayaz.controller;

import com.ayaz.model.Notification;
import com.ayaz.producer.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NotificationController {

    @Autowired
    private NotificationProducer notificationProducer;

    @PostMapping("/queue")
    public void sendQueue(@RequestBody Notification notification){
        notificationProducer.sendToQueue(notification);
    }
}
