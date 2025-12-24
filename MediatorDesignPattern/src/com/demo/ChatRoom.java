package com.demo;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {

    List<User> userList= new ArrayList<User>();

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : userList) {
            if (!user.equals(sender)) {
                user.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}
