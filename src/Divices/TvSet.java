package Divices;

public class TvSet implements Device {
    private static final int MAX_VOLUME = 100;
    private static final int MAX_CHANNEL = 999;

    private int volume;
    private int channel;
    private boolean working;

    @Override
    public void turnOff() {
        this.working = false;
    }

    @Override
    public void turnOn() {
        this.working = true;
    }

    @Override
    public void setVolume(int volume) {
        if (MAX_VOLUME>volume && volume >= 0){
            this.volume = volume;
        }

    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setChannel(int channel) {
        if (MAX_CHANNEL>channel && channel >=0){
            this.channel = channel;
        }
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public boolean isWork() {
        return this.working;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm TV set.");
        System.out.println("| I'm " + (working ? "working" : "not working"));
        System.out.println("| Current volume is " + (volume == 0 ? "off" : volume+"%"));
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
