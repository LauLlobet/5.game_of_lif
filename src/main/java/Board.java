public class Board {
    private int[][] array;
    private int heigh;
    private int width;

    Board(int width, int height) {
        this.width = width;
        this.heigh = height;
        this.array = new int[width][height];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return heigh;
    }

    public boolean isAlive(int row, int column) {
        return array[row][column] == 1;
    }

    public void setAlive(int row, int column) {
        array[row][column] = 1;
    }

    public int countAliveNeighbours(int row, int column) {
        int neighbours = 0;
        if(row > 0){
            neighbours +=array[row-1][column];
            neighbours +=array[row+1][column-1];
        }
        if(column > 0){
            neighbours += array[row][column-1];
            neighbours += array[row-1][column+1];
        }
        if (column > 0 && row > 0){
            neighbours += array[row-1][column-1];

        }
        return  neighbours +
                array[row+1][column]+
                array[row][column+1]+
                array[row+1][column+1];
    }
}
