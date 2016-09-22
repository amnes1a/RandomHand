import java.util.ArrayList;

public class LeftHand {
    private ArrayList<Finger> fingers;

    public LeftHand(){
        fingers = new ArrayList<>();
        fingers.add(new Finger("1","q"));
        fingers.add(new Finger("2","w"));
        fingers.add(new Finger("3","e"));
        fingers.add(new Finger("4","r"));
        fingers.add(new Finger("5","t"));
    }

    public ArrayList getFingers(){
        return fingers;
    }

}
