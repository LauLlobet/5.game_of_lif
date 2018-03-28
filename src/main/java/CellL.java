public class CellL {
    private final CellAccessor cellAccessor;
    private boolean alive = false;
    private Coordinate ownCoordinate;

    public CellL(CellAccessor cellAccessor, Coordinate coordinate) {
        this.cellAccessor = cellAccessor;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive() {
        alive = true;
    }

    public int countNeigbours() {
        cellAccessor.getCell(ownCoordinate.up());
        return 0;
    }
}
