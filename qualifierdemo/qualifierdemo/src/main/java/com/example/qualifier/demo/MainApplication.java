package com.example.qualifier.demo;

import com.example.qualifier.demo.message_service.MessageProcessor;
import com.example.qualifier.demo.message_service.config.AppConfiguration;
import com.example.qualifier.demo.student_profiles.Profile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class, args);

        callMessageServiceDemo();

        callStudentProfileDemo();

    }

    private static void callMessageServiceDemo() {
        /**
         * Message Service Demo
         */
        ApplicationContext msgServiceApplicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MessageProcessor messageProcessor = msgServiceApplicationContext.getBean(MessageProcessor.class);

        //ApplicationContext msgServiceApplicationContext = new ClassPathXmlApplicationContext("message-service-beans.xml");
        //MessageProcessor messageProcessor = (MessageProcessor) msgServiceApplicationContext.getBean("messageProcessor");

        messageProcessor.processMessage("Hello");
    }

    private static void callStudentProfileDemo() {
        /**
         * Student Profile Demo
         */
        ApplicationContext studentProfileApplicationContext = new ClassPathXmlApplicationContext("students-profile-beans.xml");
        Profile profile = (Profile) studentProfileApplicationContext.getBean("profile");
        profile.printName();
        profile.printAge();
    }

}