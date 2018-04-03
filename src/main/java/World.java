import java.util.HashMap;

public class World {

    private HashMap<Coordinate, Cell> hashMap;

    public World(int initCoordinateX, int initCoordinateY, int width, int height){
        hashMap = new HashMap<>();
        for(int x = initCoordinateX; x < width; x++){
            for (int y = initCoordinateY; y < height; y++){
                createAndStoreNewCell(new Coordinate(x,y));
            }
        }
    }


    public Cell getCell(Coordinate coordinate) {
        Cell guessedCell = hashMap.get(coordinate);
        if(guessedCell != null){
            return guessedCell;
        }
        return createAndStoreNewCell(coordinate);
    }

    private Cell createAndStoreNewCell(Coordinate coordinate) {
        Cell newCell = new Cell();
        hashMap.put(coordinate, newCell);
        return newCell;
    }

    public int countCoordinateAliveNeighbours(Coordinate coordinate) {
        int counter = 0;
        if(this.getCellIsAlive(coordinate.up())) counter++;
        if(this.getCellIsAlive(coordinate.upL())) counter++;
        if(this.getCellIsAlive(coordinate.upR())) counter++;
        if(this.getCellIsAlive(coordinate.left())) counter++;
        if(this.getCellIsAlive(coordinate.right())) counter++;
        if(this.getCellIsAlive(coordinate.down())) counter++;
        if(this.getCellIsAlive(coordinate.downL())) counter++;
        if(this.getCellIsAlive(coordinate.downR())) counter++;
        return counter;
    }

    private boolean getCellIsAlive(Coordinate coordinate) {
        return hashMap.containsKey(coordinate) && hashMap.get(coordinate).isAlive();
    }

    public void calculateAndSetNextGeneration() {
        calculateNextGenerationStateForAllCells();
        setNextGenerationStateForAllCells();
    }

    private void calculateNextGenerationStateForAllCells() {
        hashMap.forEach((coordinate, cell) -> {
            int neighbours = countCoordinateAliveNeighbours(coordinate);
            cell.calculateNextGenerationState(neighbours);
        });
    }

    private void setNextGenerationStateForAllCells() {
        hashMap.values().forEach(Cell::setToNextGenerationState);
    }
}
