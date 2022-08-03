package com.jms;

import java.net.URI;
import java.net.URISyntaxException;
 
import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class SpringJmsExample {
    public static void main(String[] args) throws URISyntaxException, Exception {
        BrokerService broker = BrokerFactory.createBroker(new URI(
                "broker:(tcp://localhost:61616)"));
        broker.start();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "Beans.xml");
 
        try {
            SpringJmsProducer springJmsProducer = (SpringJmsProducer) context
                    .getBean("springJmsProducer");
            springJmsProducer.sendMessage("Hi");
 
            SpringJmsConsumer springJmsConsumer = (SpringJmsConsumer) context
                    .getBean("springJmsConsumer");
            System.out.println("Consumer receives " + springJmsConsumer.receiveMessage());
        } finally {
            broker.stop();
            context.close();
        }
    }
}
