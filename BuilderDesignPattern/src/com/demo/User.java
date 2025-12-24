package com.demo;

public class User {
    private String name;
    private int age;
    private String address;
    private String phone;

    private User(UserBuilder userBuilder)
    {
        this.name=userBuilder.name;
        this.age=userBuilder.age;
        this.address=userBuilder.address;
        this.phone=userBuilder.phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class UserBuilder{
        private String name;
        private int age;
        private String address;
        private String phone;
        public UserBuilder name(String name)
        {
            this.name=name;
            return this;
        }
        public UserBuilder age(int age)
        {
            if(age<0)
                throw new IllegalArgumentException("age can't be less than 0");
            this.age=age;
            return this;
        }
        public UserBuilder address(String address)
        {
            this.address=address;
            return this;
        }
        public UserBuilder phone(String phone)
        {
            this.phone=phone;
            return this;
        }
        public User build()
        {
            return new User(this);
        }
    }



}
