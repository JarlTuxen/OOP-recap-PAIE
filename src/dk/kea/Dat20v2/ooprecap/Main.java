package dk.kea.Dat20v2.ooprecap;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // Initialize Machine and turn On and off
        Machine m = new Machine();
        System.out.println(m);
        m.setState(true);
        System.out.println(m);

        // add radio with news and dvd that can play Metallica
        m = new Radio();
        System.out.println(m);
        m.setState(true);
        System.out.println(m);

        m = new DvdPlayer("Laid Back");
        System.out.println(m);
        m.setState(true);
        System.out.println(m);
        ((DvdPlayer) m).changeTitle("Slayer");
        System.out.println(m);

        System.out.println("===============Polymorfi når det er smart=================");

        // polymorfi - change dvd med instanceof
        List<Machine> machineList = new ArrayList<>();
        machineList.add(new Machine());
        machineList.add(new Radio());
        machineList.add(new DvdPlayer("Rasmus Seebach"));

        //iterer over machineList
        for (Machine machine: machineList){
            System.out.println(machine);
            machine.setState(true);
            System.out.println(machine);
            if (machine instanceof DvdPlayer) {
                ((DvdPlayer) machine).changeTitle("Bach");
                System.out.println(machine);
            }
        }
    }
}
