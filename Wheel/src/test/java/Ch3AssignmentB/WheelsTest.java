package Ch3AssignmentB;

import org.junit.Test;

import static org.junit.Assert.*;

public class WheelsTest {
    Wheels wheel = new Wheels(4, 15);
    public WheelsTest() {

        Wheels result = wheel;
        assertEquals(wheel, result);
    }

    @Test
    public void pressure() {
        double bar = 3;
        assertEquals(bar,3,0);
    }
    
}