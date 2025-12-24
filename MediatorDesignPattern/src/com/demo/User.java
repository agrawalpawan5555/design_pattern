package com.demo;

public abstract class User {

    protected ChatMediator mediator;
    protected String name;
    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
    }

    abstract public void sendMessage(String message);
    abstract public void receiveMessage(String message);

}
