package com.demo.command;

import com.demo.reciever.Device;

public class DeviceTurnOnCommand implements Command {

    private Device device;
    public DeviceTurnOnCommand(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.deviceTurnOn();
    }
}
