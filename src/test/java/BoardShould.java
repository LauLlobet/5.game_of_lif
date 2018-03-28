import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BoardShould {
    private Board board;

    @Before
    public void prepare_standard_board(){
        board = new Board(10,20);
    }

    @Test
    public void be_of_given_size(){
        assertEquals(board.getWidth(),10);
        assertEquals(board.getHeight(),20);
    }

    @Test
    public void start_with_all_cells_dead(){
        assertFalse(board.isAlive(0,1));
        assertFalse(board.isAlive(1,2));
        assertFalse(board.isAlive(2,3));
    }

    @Test
    public void set_a_cell_to_alive(){
        board.setAlive(1,2);
        assertTrue(board.isAlive(1,2));
    }

    @Test
    public void count_0_alive_neighbours_when_there_are_0_neighbours_alive(){
        board.setAlive(3,3);
        assertEquals(board.countAliveNeighbours(3,3),0);
    }

    @Test
    public void count_number_of_alive_neighbours_for_a_given_position(){
        board.setAlive(3,1);
        board.setAlive(4,2);
        board.setAlive(3,3);
        board.setAlive(3,2);
        assertEquals(board.countAliveNeighbours(3,2),3);
    }

    @Test
    public void count_number_of_alive_neigbours_in_top_left_corner_cases(){
        board.setAlive(0,0);
        board.setAlive(1,0);
        board.setAlive(0,1);
        assertEquals(board.countAliveNeighbours(0,0),2);
    }

    @Test
    public void count_number_of_alive_neigbours_in_bottom_right_corner_case(){
        board.setAlive(9,19);
        board.setAlive(8,19);
        board.setAlive(9,18);
        assertEquals(board.countAliveNeighbours(0,0),2);
    }
}
