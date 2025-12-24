package com.demo.mac;
import com.demo.Button;
public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("MacButton clicked");
    }
}
