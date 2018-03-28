import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardShould {
    Board board;

    @Before
    public void prepare_standard_boar(){
        board = new Board(5,4);
    }

    @Test
    public void be_of_given_size(){
        assertEquals(board.getWidth(),5);
        assertEquals(board.getHeigh(),4);
    }

    @Test
    public void tart_with_all_cells_dead(){
        assertFalse(board.isAlive(0,1));
        assertFalse(board.isAlive(0,2));
        assertFalse(board.isAlive(0,3));
        assertFalse(board.isAlive(0,4));

    }
}
