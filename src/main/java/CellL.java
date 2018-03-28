public class CellL {
    private boolean alive = false;
    private boolean nextAlive = false;

    public boolean isAlive() {
        return  alive;
    }

    public void calculateNextGeneration(int neigbours){
        if(neigbours == 2 && alive){
            nextAlive= true;
            return;
        }
        if(neigbours == 3){
            nextAlive = true;
            return;
        }
        nextAlive = false;
    }

    public void setAlive() {
        alive = true;
    }

    public void setToNextGeneration() {
        alive = nextAlive;
    }
}
