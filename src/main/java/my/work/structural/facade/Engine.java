package my.work.structural.facade;

public class Engine {

    private boolean isRunning;

    public void start() {
        this.isRunning = true;
    }

    public boolean isStarted() {
        return this.isRunning;
    }

}
