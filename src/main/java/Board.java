
public class Board {
    private BoardCell[][] array;
    private int heigh;
    private int width;

    Board(int width, int height) {
        this.width = width;
        this.heigh = height;
        this.array = new BoardCell[width][height];
        for (int x = 0; x<width; x++){
            for (int y =0; y<height; y++){
                array[x][y] = BoardCell.DEAD;
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return heigh;
    }

    public boolean isAlive(int row, int column) {
        return array[row][column] == BoardCell.ALIVE;
    }

    public void setAlive(int row, int column) {
        array[row][column] = BoardCell.ALIVE;
    }

    public int countAliveNeighbours(int row, int column) {
        int neighbours = 0;
        if(row > 0){
            neighbours +=array[row-1][column].getIsAliveCount();
            neighbours +=array[row+1][column-1].getIsAliveCount();
        }
        if(column > 0){
            neighbours += array[row][column-1].getIsAliveCount();
            neighbours += array[row-1][column+1].getIsAliveCount();
        }
        if (column > 0 && row > 0){
            neighbours += array[row-1][column-1].getIsAliveCount();

        }
        return  neighbours +
                array[row+1][column].getIsAliveCount()+
                array[row][column+1].getIsAliveCount()+
                array[row+1][column+1].getIsAliveCount();
    }
}
