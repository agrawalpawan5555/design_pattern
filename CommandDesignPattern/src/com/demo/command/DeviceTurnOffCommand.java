package com.demo.command;

import com.demo.reciever.Device;

public class DeviceTurnOffCommand  implements Command {

  Device device;
  public DeviceTurnOffCommand(Device device) {
    this.device = device;
  }
  public void execute() {
      device.deviceTurnOff();
  }

}
