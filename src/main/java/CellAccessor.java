import java.util.HashMap;

public class CellAccessor {
    private HashMap<String,CellL> hashMap = new HashMap<String, CellL>();
    public CellL getCell(int i, int i1) {
        CellL guessedCell = hashMap.get(""+i+","+i1);
        if(guessedCell != null){
            return guessedCell;
        }
        hashMap.put(""+i+","+i1,new CellL());
        return getCell(i,i1);
    }
}
