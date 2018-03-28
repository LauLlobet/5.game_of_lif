import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardShould {
    @Test
    public void be_of_given_size(){
        Board board = new Board(3,4);
        assertEquals(board.getWidth(),3);
        assertEquals(board.getHeigh(),4);
    }
}
