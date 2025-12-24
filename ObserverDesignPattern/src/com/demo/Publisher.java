package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    public void publishMessage(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.onMessage(message);
        }
    }
}
