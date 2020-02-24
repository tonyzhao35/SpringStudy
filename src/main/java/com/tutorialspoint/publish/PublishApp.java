package com.tutorialspoint.publish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PublishApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Publish.xml");
        CustomEventPublisher publisher = (CustomEventPublisher) context.getBean("customEventPublisher");
        publisher.publish();

    }
}
