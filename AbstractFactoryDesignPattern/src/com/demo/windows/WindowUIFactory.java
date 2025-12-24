package com.demo.windows;

import com.demo.Button;
import com.demo.CheckBox;
import com.demo.UIFactory;

public class WindowUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
