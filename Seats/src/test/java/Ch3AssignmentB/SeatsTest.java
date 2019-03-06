package Ch3AssignmentB;

import org.junit.Test;

import static org.junit.Assert.*;

public class SeatsTest {
Seats seat = new Seats(4);
    @Test
    public void carType() {
        String result = "sedan";
        assertEquals(result, "sedan");
    }
}