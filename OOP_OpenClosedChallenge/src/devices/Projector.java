package devices;

import java.lang.reflect.InvocationTargetException;

public class Projector implements IDevice {

    private static Projector instanceDevice = new Projector();;

    @Override
    public void turnOn() {
        System.out.println("Turning Projector on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning Projector off...");
    }

    public void pullDownScreen() {
        System.out.println("Moving Projector Screen down...");
    }

    public void putScreenUp() {
        System.out.println("Moving Projector Screen up...");
    }

    @Override
    public String toString() {
        return "Projector";
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
