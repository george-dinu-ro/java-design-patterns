package my.work.structural.bridge.car;

import my.work.structural.bridge.engine.Engine;

public abstract class Car {

    protected Engine engine;

    protected Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void checkEngine();

    public Engine getEngine() {
        return engine;
    }

}
