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

    public int getHeigh() {
        return heigh;
    }

    public boolean isAlive(int row, int column) {
        return array[row][column] == 1;
    }

    public void setAlive(int row, int column) {
        array[row][column] = 1;
    }

    public int countAliveNeighbours(int row, int column) {


        return  0;
    }
}
