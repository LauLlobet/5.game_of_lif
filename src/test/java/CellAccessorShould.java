import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CellAccessorShould {

    @Test
    public void create_a_new_cell_if_it_has_never_been_accesed(){
        CellAccessor cellAccessor = new  CellAccessor();
        CellL cell = cellAccessor.getCell(0,0);
        assertNotNull(cell);
    }


}
