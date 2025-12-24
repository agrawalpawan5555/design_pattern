package com.demo;

import com.demo.command.Command;
import com.demo.command.DeviceTurnOffCommand;
import com.demo.command.DeviceTurnOnCommand;
import com.demo.reciever.Device;

public class DemoMain {
    public static void main(String[] args) {

        Device device = new Device();

        Command command = new DeviceTurnOnCommand(device);
        RemoteControlller remoteControlller = new RemoteControlller(command);
        remoteControlller.pressButton();

       Command command2 = new DeviceTurnOffCommand(device);

       remoteControlller.setCommand(command2);
       remoteControlller.pressButton();
    }
}
