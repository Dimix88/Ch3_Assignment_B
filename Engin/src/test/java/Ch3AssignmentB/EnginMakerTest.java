package Ch3AssignmentB;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EnginMakerTest {
    Engin eng = new Engin(1.3);
    List<Engin> parts = new ArrayList<>();
    @Test
    public void speed()
    {Engin eng = new Engin(1.3);
        Engin eng2 = new Engin(1.5);

        List<Engin> part = new ArrayList<>();
        part.add(eng);
        part.add(eng2);
        parts.addAll(part);

        assertEquals("Check if the names were added to the LinkedList", 2, part.size());
    }
}