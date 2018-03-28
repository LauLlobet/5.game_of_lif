
public class Board {
    private Cell[][] array;
    private int heigh;
    private int width;

    Board(int width, int height) {
        this.array = new Cell[width][height];
        setAllCellsToDead();
    }

    public int getWidth() {
        return array.length;
    }

    public int getHeight() {
        return array[0].length;
    }

    public boolean isAlive(int row, int column) {
        return array[row][column] == Cell.ALIVE;
    }

    public void setAlive(int row, int column) {
        array[row][column] = Cell.ALIVE;
    }

    public int countAliveNeighbours(int row, int column) {
        int neighbours = 0;
        if(row > 0){
            neighbours +=array[row-1][column].getIsAliveCount();
        }
        if(row > 0 && column < heigh -1){
            neighbours += array[row+1][column+1].getIsAliveCount();
        }
        if(column > 0){
            neighbours += array[row][column-1].getIsAliveCount();
        }
        if(column > 0 && row < width -1){
            neighbours += array[row-1][column+1].getIsAliveCount();
        }
        if (column > 0 && row > 0){
            neighbours += array[row-1][column-1].getIsAliveCount();
        }
        if(column < heigh -1){
            neighbours += array[row][column+1].getIsAliveCount();
        }
        if(row < width -1){
            neighbours += array[row+1][column].getIsAliveCount();
        }
        if(row <width-1 && column < width-1){
            neighbours += array[row+1][column+1].getIsAliveCount();
        }
        return  neighbours;

    }

    private void setAllCellsToDead() {
        for (int x = 0; x<this.getWidth(); x++){
            for (int y =0; y<this.getHeight(); y++){
                array[x][y] = Cell.DEAD;
            }
        }
    }
}
