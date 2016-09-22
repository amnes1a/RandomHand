import java.util.ArrayList;

public class RightHand {
    private ArrayList<Finger> fingers;

    public RightHand(){
        fingers = new ArrayList<>();
        fingers.add(new Finger("6","y"));
        fingers.add(new Finger("7","u"));
        fingers.add(new Finger("8","i"));
        fingers.add(new Finger("9","o"));
        fingers.add(new Finger("0","p"));
    }

    public ArrayList getFingers(){
        return fingers;
    }
}
