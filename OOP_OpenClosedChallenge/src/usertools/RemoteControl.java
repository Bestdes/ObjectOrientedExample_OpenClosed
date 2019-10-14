package usertools;


import devices.IDevice;

public class RemoteControl {

    private Object convertedIDevice;

    public Object targetDevice(IDevice controlledDevice) {
        System.out.println("Targeting device..."+ controlledDevice);
        return convertedIDevice;
    }

    public void turnOnDevice(IDevice controlledDevice) {
        System.out.println("Remotely turning on..."+ controlledDevice);
        controlledDevice.turnOn();
    }

    public void turnOffDevice(IDevice controlledDevice) {
        System.out.println("Remotely turning off..." + controlledDevice);
        controlledDevice.turnOff();
    }

    public void turnDownVolume(IDevice controlledDevice) {
        System.out.println("Remotely turning down volume..." + controlledDevice);
        controlledDevice.useBehavior(getMethodName());
    }

    public void turnUpVolume(IDevice controlledDevice) {
        System.out.println("Remotely turning up volume..." + controlledDevice);
        controlledDevice.useBehavior(getMethodName());
    }

    public void changeChannelDown(IDevice controlledDevice) {
        System.out.println("Remotely changing channel down...");
        controlledDevice.useBehavior(getMethodName());
    }

    public void changeChannelUp(IDevice controlledDevice) {
        System.out.println("Remotely changing channel up...");
        controlledDevice.useBehavior(getMethodName());
    }

    private String getMethodName() { // This method is a achievement of mine that gets the name of the method that implements the getMethodName method.

        /*
        The stack trace index bracket determines what level the method will extract the
        name of the enclosing method. For example with it set as: getStackTrace[0] the
        method will allways return a string of "getMethodName", however when you change
        the index to: [1], now the method will return the name of any method that is a
        wrapper method for the method: getMethodName.
         */
        String methodName = new Exception().getStackTrace()[1].getMethodName();
        return methodName;
    }
}
