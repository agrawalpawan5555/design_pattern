package com.demo;

import com.demo.command.Command;

public class RemoteControlller {

    private Command command;
    public RemoteControlller(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
