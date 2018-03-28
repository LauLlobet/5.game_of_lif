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
    public void get_is_alive_of_a_cell(){

    }
}
