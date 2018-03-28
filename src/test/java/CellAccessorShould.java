import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CellAccessorShould {

    World cellAccessor;

    @Before
    public void create_cell_accessor(){
        cellAccessor = new World();
    }

    @Test
    public void create_a_new_cell_if_it_has_never_been_accesed(){
        CellL cell = cellAccessor.getCell(new Coordinate(0,0));
        assertNotNull(cell);
    }

    @Test
    public void return_same_cell_for_same_coordinates(){
        CellL cell = cellAccessor.getCell(new Coordinate(0,0));
        CellL cell2 = cellAccessor.getCell(new Coordinate(0,0));
        assertEquals(cell,cell2);
    }

    @Test
    public void count_alive_cells_around_coordinate(){
        Coordinate c = new Coordinate(0,0);
        cellAccessor.getCell(c.up()).setAlive();
        cellAccessor.getCell(c.upR()).setAlive();
        cellAccessor.getCell(c.right()).setAlive();
        cellAccessor.getCell(c.downR()).setAlive();
        cellAccessor.getCell(c.down()).setAlive();
        cellAccessor.getCell(c.downL()).setAlive();
        cellAccessor.getCell(c.left()).setAlive();
        cellAccessor.getCell(c.upL()).setAlive();

        assertEquals(8,cellAccessor.countNeihboursAlive(new Coordinate(0,0)));
    }

}
