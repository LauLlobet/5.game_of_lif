import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WorldShould {

    private World world;

    @Before
    public void before(){
        world = new World(-10,-10,10,10);
    }

    @Test
    public void create_a_new_cell_if_it_has_never_been_accessed(){
        Cell cell = world.getCell(new Coordinate(0,0));
        assertNotNull(cell);
    }

    @Test
    public void return_same_cell_for_same_coordinates(){
        Cell cell = world.getCell(new Coordinate(0,0));
        Cell cell2 = world.getCell(new Coordinate(0,0));
        assertEquals(cell,cell2);
    }

    @Test
    public void count_alive_cells_around_coordinate(){
        Coordinate c = new Coordinate(0,0);
        world.getCell(c.up()).setAlive();
        world.getCell(c.upR()).setAlive();
        world.getCell(c.right()).setAlive();
        world.getCell(c.downR()).setAlive();
        world.getCell(c.down()).setAlive();
        world.getCell(c.downL()).setAlive();
        world.getCell(c.left()).setAlive();
        world.getCell(c.upL()).setAlive();

        assertEquals(8, world.countCoordinateAliveNeighbours(new Coordinate(0,0)));
    }

}
