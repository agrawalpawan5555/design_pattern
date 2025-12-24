package com.demo;

public class Demo {
    public static void main(String[] args) {
        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();
        Subscriber subscriber3 = new Subscriber();

        Publisher publisher = new Publisher();
        publisher.addSubscriber(subscriber1);
        publisher.addSubscriber(subscriber2);
        publisher.addSubscriber(subscriber3);

        publisher.publishMessage("Hello World");
    }
}
