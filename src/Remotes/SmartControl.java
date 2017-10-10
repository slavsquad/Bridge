package Remotes;

import Divices.Device;

public class SmartControl extends StandartControl {
    private Device device;

    public SmartControl(Device device) {
        super(device);
        this.device = device;
    }

    public void mute(){
        device.setVolume(0);
    }

}
