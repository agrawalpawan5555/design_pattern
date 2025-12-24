package com.demo.mac;

import com.demo.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void change() {
        System.out.println("MacCheckBox change");
    }
}
