package com.demo.windows;

import com.demo.Button;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("windows button clicked");
    }
}
