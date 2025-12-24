package com.demo;

public class MediatorDemo {
    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoom();

        User u1 = new ConcreteUser(chatRoom, "Amit");
        User u2 = new ConcreteUser(chatRoom, "Neha");
        User u3 = new ConcreteUser(chatRoom, "Rahul");

        chatRoom.addUser(u1);
        chatRoom.addUser(u2);
        chatRoom.addUser(u3);

        u1.sendMessage("Hello everyone!");
    }
}
