package Divices;

public class TvBox extends TvSet {

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm TV box.");
        System.out.println("| I'm " + (super.isWork()? "working" : "not working"));
        System.out.println("| Current volume is " + (super.getVolume() == 0 ? "off" : super.getVolume()+"%"));
        System.out.println("| Current channel is " + super.getChannel());
        System.out.println("------------------------------------\n");
    }
}
