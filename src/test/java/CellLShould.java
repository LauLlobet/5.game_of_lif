import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CellLShould {

    private CellAccessor cellAccessor;
    private CellL cell;

    @Before
    public void before(){
        cellAccessor = new CellAccessor();
        cell = cellAccessor.getCell(new Coordinate(0,0));

    }

    @Test
    public void be_dead_at_creation(){
        CellL c = new CellL(cellAccessor,new Coordinate(0,0));
        assertFalse(c.isAlive());
    }

    @Test
    public void count_his_neighbours(){
        assertEquals(0,cell.countNeigbours());

        cellAccessor.getCell(new Coordinate(0,1)).setAlive();

        assertEquals(0,cell.countNeigbours(),1);
    }
}
