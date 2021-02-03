package dk.kea.Dat20v2.ooprecap;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine machine = (Machine) o;
        return isOn == machine.isOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOn);
    }
}
