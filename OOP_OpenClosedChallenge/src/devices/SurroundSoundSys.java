package devices;

import java.lang.reflect.InvocationTargetException;

public class SurroundSoundSys  implements IDevice {

    private static SurroundSoundSys instanceDevice =  new SurroundSoundSys();

    @Override
    public void turnOn() {
        System.out.println("Turning Surround Sound on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning Surround Sound off...");

    }

    public void turnUpVolume() {
        System.out.println("Turning up Surround Sound volume...");
    }

    public void turnDownVolume() {
        System.out.println("Turning down Surround Sound volume...");
    }

    @Override
    public String toString() {
        return "SurroundSoundSys";
    }

    @Override
    public void useBehavior(String callerName) {
        /*
        This method is another achievement, due to the complexity that it took to find it's
        solution. What this method does is take in a string and with that string it will
        seek to find a method with that same name of an object that is specified
        (in this case it is an instance of the same class that this method resides in). Once a method with the
        same name that is passed in is found, it will run that method. If no method is found
        with the name of the string that is passed in the method will throw and error and print a specified
        string.
         */

        java.lang.reflect.Method method = null;

        try {
            method = instanceDevice.getClass().getMethod(callerName);
        }
        catch (SecurityException e) {
        }
        catch (NoSuchMethodException e) {
            System.out.println("There is no such behavior exists for selected device!");
        }

        try {
            method.invoke(instanceDevice);
        }
        catch (IllegalArgumentException e) {}
        catch (IllegalAccessException e) {}
        catch (InvocationTargetException e) {}
    }
}
