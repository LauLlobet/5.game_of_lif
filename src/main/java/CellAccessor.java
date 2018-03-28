import java.util.HashMap;

public class CellAccessor {
    private HashMap<Coordinate,CellL> hashMap = new HashMap<Coordinate, CellL>();

    public CellL getCell(Coordinate coordinate) {
        CellL guessedCell = hashMap.get(coordinate);
        if(guessedCell != null){
            return guessedCell;
        }
        hashMap.put(coordinate,new CellL());
        return getCell(coordinate);
    }
}
