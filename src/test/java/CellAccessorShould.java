import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CellAccessorShould {

    CellAccessor cellAccessor;

    @Before
    public void create_cell_accessor(){
        cellAccessor = new  CellAccessor();
    }

    @Test
    public void create_a_new_cell_if_it_has_never_been_accesed(){
        CellL cell = cellAccessor.getCell(0,0);
        assertNotNull(cell);
    }

    @Test
    public void return_same_cell_for_same_coordinates(){
        CellL cell = cellAccessor.getCell(0,0);
        CellL cell2 = cellAccessor.getCell(0,0);
        assertEquals(cell,cell2);
    }


}
