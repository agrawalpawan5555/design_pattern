package com.demo.clonable;

public class CloneMain {
    public static void main(String[] args)  {

        User user= new User("pawan",40);
        System.out.println(user);
        User cloneUser = (User)user.clone();
        user.setAge(39);
        System.out.println("User after updating age"+ user.toString());
        System.out.println(cloneUser);
    }
}
