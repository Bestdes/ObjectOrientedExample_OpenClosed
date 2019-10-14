package devices;

public interface IDevice {

    public void turnOn();
    public void turnOff();
    public String toString();
    public void useBehavior(String callerName);


}
