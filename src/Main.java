import Divices.Device;
import Divices.TvBox;
import Divices.Radio;
import Divices.TvSet;
import Remotes.Control;
import Remotes.SmartControl;
import Remotes.StandartControl;

public class Main {
    public static void main(String[] args) {
        Device device = new TvSet();
        testDevice(device);

        device = new Radio();
        testDevice(device);

        device = new TvBox();
        testDevice(device);

    }

    private static void testDevice(Device device) {
        StandartControl standartControl = new StandartControl(device);
        System.out.println("Standart control test");
        testControl(standartControl);
        standartControl.status();

        SmartControl smartControl = new SmartControl(device);
        System.out.println("Smart control test");
        testControl(smartControl);
        smartControl.mute();
        smartControl.status();

    }

    private static void testControl(Control control) {
        control.power();
        control.setChannel(23);

        for (int i = 0; i<1000;i++){
            control.volumeUp();
            control.channelUp();
        }

        for (int i = 0; i<5;i++){
            control.volumeDown();
            control.channelDown();
        }
    }
}
