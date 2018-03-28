public class Board {
    private boolean[][] array;
    private int heigh;
    private int width;

    Board(int width, int height) {
        this.width = width;
        this.heigh = height;
        this.array = new boolean[width][height];
    }

    public int getWidth() {
        return width;
    }

    public int getHeigh() {
        return heigh;
    }

    public boolean isAlive(int row, int column) {
        return array[row][column];
    }

    public void setAlive(int row, int column) {
        array[row][column] = true;
    }

    public int countAliveNeighbours(int row, int column) {
        return  0;
    }
}
