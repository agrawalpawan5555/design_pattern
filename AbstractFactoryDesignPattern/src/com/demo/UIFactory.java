package com.demo;

import com.demo.windows.WindowsCheckBox;

public interface UIFactory {
    public Button createButton();
    public CheckBox createCheckBox();
    default public void paint()
    {
        createButton().click();
        createCheckBox().change();
    }
}
