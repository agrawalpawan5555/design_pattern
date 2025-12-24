package com.demo.mac;

import com.demo.Button;
import com.demo.CheckBox;
import com.demo.UIFactory;
import com.demo.windows.WindowsButton;
import com.demo.windows.WindowsCheckBox;

public class MacUIFactory implements UIFactory {


    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
