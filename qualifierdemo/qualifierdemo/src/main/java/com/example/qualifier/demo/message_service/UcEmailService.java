package com.example.qualifier.demo.message_service;

public class UcEmailService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("***********************************..." + message + "...***********************************");
    }
}
