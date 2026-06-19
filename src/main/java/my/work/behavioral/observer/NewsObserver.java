package my.work.behavioral.observer;

public class NewsObserver implements Observer {

    private Object message;

    @Override
    public Object getMessage() {
        return this.message;
    }

    @Override
    public void update(Object message) {
        this.message = message;
    }

}
