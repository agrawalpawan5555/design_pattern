package com.demo;

public class ConcreteUser extends User {

    public ConcreteUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void sendMessage(String message) {
      System.out.println("send message: " + message);
      mediator.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message) {

        System.out.println("receive message: " + message);
    }
}
