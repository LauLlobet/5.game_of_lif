public class Cell {
    private boolean alive = false;
    private boolean nextAlive = false;

    public void calculateNextGenerationState(int neighbours){
        if(neighbours == 2 && alive || neighbours == 3){
            nextAlive = true;
            return;
        }
        nextAlive = false;
    }

    public void setAlive() {
        alive = true;
    }

    public void setToNextGenerationState() {
        alive = nextAlive;
    }

    public boolean isAlive() {
        return alive;
    }
}
