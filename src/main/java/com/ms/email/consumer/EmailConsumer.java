package com.ms.email.consumer;

import com.ms.email.DTOS.EmailDTO;
import com.ms.email.entities.EmailEntity;
import com.ms.email.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @Autowired
    EmailService emailService;

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailDTO emailDTO){
        var emailEntity = new EmailEntity();
        BeanUtils.copyProperties(emailDTO, emailEntity);

        emailService.sendEmail(emailEntity);
    }
}
