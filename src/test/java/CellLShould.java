import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
/*
Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
Any live cell with two or three live neighbours lives on to the next generation.
Any live cell with more than three live neighbours dies, as if by overpopulation.
Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
 */
public class CellLShould {

    private World world;

    @Before
    public void before(){
        world = new World();
    }

    @Test
    public void be_dead_at_creation(){
        Cell c = new Cell();
        assertFalse(c.isAlive());
    }

    @Test
    public void procreate_cells() {
        Coordinate c = new Coordinate(0,0);

        world.getCell(c);
        world.getCell(c.up()).setAlive();
        world.getCell(c.upR()).setAlive();
        world.getCell(c.right()).setAlive();
        world.calculateAndSetNextGeneration();

        assertTrue(world.getCell(c).isAlive());
    }

    @Test
    public void mantain_alive_cells() {
        Coordinate c = new Coordinate(0,0);

        world.getCell(c).setAlive();
        world.getCell(c.upR()).setAlive();
        world.getCell(c.right()).setAlive();
        world.calculateAndSetNextGeneration();

        assertTrue(world.getCell(c).isAlive());
    }

    @Test
    public void let_die_cell() {
        Coordinate c = new Coordinate(0,0);

        world.getCell(c).setAlive();
        world.getCell(c.upR()).setAlive();
        world.calculateAndSetNextGeneration();

        assertFalse(world.getCell(c).isAlive());
    }
}
