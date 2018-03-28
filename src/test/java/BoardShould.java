import org.junit.Test;

public class BoardShould {
    @Test
    public void be_of_random_size(){
        Board board = new Board(3,4);
        assertEquals(board.getWidth(),3);
        assertEquals(board.getHeigh(),4);
    }
}
