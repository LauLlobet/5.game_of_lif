import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoordinateShould {
    @Test
    public void give_upper_coordinate(){
        Coordinate a = new Coordinate(0,0);
        assertEquals(0,a.up().x);
        assertEquals(1,a.up().y);
    }
}
