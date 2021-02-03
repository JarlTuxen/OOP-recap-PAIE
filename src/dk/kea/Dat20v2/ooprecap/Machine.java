package dk.kea.Dat20v2.ooprecap;

public class Machine {

    //field
    private boolean state;

    //constructor
    public Machine(){
        state = false;
    }

    //getters and setters
    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "state=" + state +
                '}';
    }

}
