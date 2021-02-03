package dk.kea.Dat20v2.ooprecap;

public class Radio extends Machine {

    @Override
    public String toString(){
        String str;
        if (super.getState()){
            str = "Radio tændt og spiller Metallica!";
        }
        else{
            str = "Radio slukket!";
        }
        return str;
    }
}
