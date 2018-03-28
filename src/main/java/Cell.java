public enum Cell {
    ALIVE(1),
    DEAD(0);
    private int aliveCellCounter;
    Cell(int aliveCellCounter){
        this.aliveCellCounter = aliveCellCounter;
    }

    int getIsAliveCount(){
        return aliveCellCounter;
    }
}
