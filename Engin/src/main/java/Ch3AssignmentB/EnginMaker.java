package Ch3AssignmentB;

import java.util.ArrayList;
import java.util.List;
public class EnginMaker {
    List<Engin> parts = new ArrayList<>();



    public void speed(){
        Engin eng = new Engin(1.3);
        Engin eng2 = new Engin(1.5);

        List<Engin> part = new ArrayList<>();
        part.add(eng);
        part.add(eng2);
        parts.addAll(part);


    }
}
