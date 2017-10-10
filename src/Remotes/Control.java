package Remotes;

public interface Control {
    public void power();
    public void volumeDown();
    public void volumeUp();
    public void channelDown();
    public void channelUp();
    public void setChannel(int cannel);
    public void status();
}
