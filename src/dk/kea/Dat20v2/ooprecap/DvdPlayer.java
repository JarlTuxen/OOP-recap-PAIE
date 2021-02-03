package dk.kea.Dat20v2.ooprecap;

public class DvdPlayer extends Machine{

    String title;

    DvdPlayer(String newTitle){
        //super();
        title = newTitle;
    }

    public void changeTitle(String newTitle){
        title = newTitle;
    }

    @Override
    public String toString(){
        String str;
        if (super.getState()){
            str = "DVD tændt og spiller " + title +"!";
        }
        else{
            str = "DVD slukket!";
        }
        return str;
    }
}
