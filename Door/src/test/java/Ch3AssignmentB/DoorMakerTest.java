package Ch3AssignmentB;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoorMakerTest {
    Door d = new Door(4);

    @Test
    public void doorCount() {
        int result = d.count;
        assertEquals(4, result);
    }
}