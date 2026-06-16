package my.work.structural.facade;

public class Engine {

    private boolean isStarted;

    public void start() {
        this.isStarted = true;
    }

    public boolean isStarted() {
        return this.isStarted;
    }

}
