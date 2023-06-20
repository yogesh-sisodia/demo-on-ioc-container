package com.example.qualifier.demo.message_service.config;

import com.example.qualifier.demo.message_service.Impl.MessageProcessorImpl;
import com.example.qualifier.demo.message_service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfiguration {

    @Bean(name = "emailService")
    public MessageService emailService() {
        return new UcEmailService();
    }

    @Bean(name = "smsService")
    public MessageService smsService() {
        return new UcSMSService();
    }

    @Bean(name = "twitterService")
    public MessageService twitterService() {
        return new UcTwitterService();
    }

    @Bean
    public MessageProcessor messageProcessor() {
        return new MessageProcessorImpl();
    }

}
