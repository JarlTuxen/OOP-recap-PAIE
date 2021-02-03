package dk.kea.Dat20v2;

public class Machine {

    //field
    private boolean isOn;

    //constructor
    public Machine{
        isOn = false;
    }

    //getters and setters
    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "isOn=" + isOn +
                '}';
    }
}
