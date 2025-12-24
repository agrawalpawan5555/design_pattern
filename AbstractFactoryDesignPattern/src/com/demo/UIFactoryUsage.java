package com.demo;

import com.demo.mac.MacUIFactory;
import com.demo.windows.WindowUIFactory;
import com.demo.windows.WindowsCheckBox;

public class UIFactoryUsage {

    public static UIFactory createUIFactory(String type) {

        switch (type) {
            case "Windows":
                return new WindowUIFactory();
                case "Mac"
                    : return new MacUIFactory();
                default:
                    return null;
        }
    }
}
