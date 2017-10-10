package Remotes;

import Divices.Device;

public class StandartControl implements Control {
    private Device device;

    public StandartControl(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (!device.isWork()){
            device.turnOn();
        }
    }

    @Override
    public void volumeDown() {
        int currentVolume = device.getVolume();
        currentVolume--;
        device.setVolume(currentVolume);
    }

    @Override
    public void volumeUp() {
        int currentVolume = device.getVolume();
        currentVolume++;
        device.setVolume(currentVolume);
    }

    @Override
    public void channelDown() {
        int currentChannel = device.getChannel();
        currentChannel--;
        device.setChannel(currentChannel);
    }

    @Override
    public void channelUp() {
        int currentChannel = device.getChannel();
        currentChannel++;
        device.setChannel(currentChannel);
    }

    @Override
    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    @Override
    public void status() {
        if (device.isWork()){
            device.printStatus();
        }else {
            System.out.println("This devices in not working! Please turn on!");
        }
    }

}
