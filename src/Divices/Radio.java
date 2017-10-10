package Divices;

public class Radio implements Device{
    private static final int MAX_VOLUME = 100;
    private static final int MAX_CHANNEL = 99;
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
        if (MAX_VOLUME>volume){
            this.volume = volume;
        }

    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setChannel(int channel) {
        if (MAX_CHANNEL>channel){
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
        System.out.println("| I'm Radio.");
        System.out.println("| I'm " + (working ? "working" : "not working"));
        System.out.println("| Current volume is " + (volume == 0 ? "off" : volume+"%"));
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
