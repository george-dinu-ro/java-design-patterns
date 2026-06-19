package my.work.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class NewsObservable implements Observable {

    private final Set<Observer> observers = new HashSet<>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(Object message) {
        observers.forEach(observer -> observer.update(message));
    }

}
