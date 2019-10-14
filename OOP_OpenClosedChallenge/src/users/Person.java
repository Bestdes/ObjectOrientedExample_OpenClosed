package users;

import devices.IDevice;
import usertools.RemoteControl;

public class Person {

    private String name;

    public RemoteControl useRemote() {
        RemoteControl remoteControl = new RemoteControl();
        System.out.println("Using remote control...");
        return remoteControl;
    }

    public IDevice thinkOfDevice(IDevice chosenDevice) {
        IDevice workingDevice = chosenDevice;
        System.out.println("Thinking of device..." + workingDevice);
        return chosenDevice;
    }

    public String pushOnButton(IDevice targetedDevice, String buttonPressed) {
        System.out.println("Pushing on button...." + buttonPressed);
        return buttonPressed;
    }
}
