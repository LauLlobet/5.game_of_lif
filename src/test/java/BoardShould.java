import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BoardShould {
    Board board;

    @Before
    public void prepare_standard_boar(){
        board = new Board(20,30);
    }

    @Test
    public void be_of_given_size(){
        assertEquals(board.getWidth(),20);
        assertEquals(board.getHeigh(),30);
    }

    @Test
    public  void create_cells_with_correct_neighbours(){
        ArrayList<CellL> neighbours = board.getNeighbours(0,0);
        assertEquals(8, neighbours.size());
    }
}
