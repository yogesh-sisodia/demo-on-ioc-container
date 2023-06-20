package com.example.qualifier.demo.message_service.Impl;

import com.example.qualifier.demo.message_service.MessageProcessor;
import com.example.qualifier.demo.message_service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageProcessorImpl implements MessageProcessor {

    /*@Autowired
    @Qualifier("emailMessageService")
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }*/

    @Autowired
    @Qualifier("emailService")
    private MessageService messageService1;

    @Autowired
    @Qualifier("smsService")
    private MessageService messageService2;

    @Autowired
    @Qualifier("twitterService")
    private MessageService messageService3;

    /*public MessageProcessorImpl(MessageService messageService) {
        this.messageService = messageService;
    }*/

    @Override
    public void processMessage(String message) {

        messageService1.sendMessage(message.concat(" Email Service"));
        messageService2.sendMessage(message.concat(" SMS Service"));
        messageService3.sendMessage(message.concat(" Twitter Service"));
    }
}