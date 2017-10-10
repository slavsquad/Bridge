package Divices;

public interface Device {
    public void turnOff();
    public void turnOn();
    public void setVolume(int volume);
    public int getVolume();
    public void setChannel(int channel);
    public int getChannel();
    public boolean isWork();
    public void printStatus();
}
