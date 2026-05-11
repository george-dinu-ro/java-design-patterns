package my.work.creational.prototype;

public class Vehicle implements Cloneable {

    public enum Type {
        CAR, TRUCK
    }

    public enum Engine {
        ECONOMIC, POWERFUL
    }

    public Vehicle(Type type, Engine engine) {
        this.type = type;
        this.engine = engine;
    }

    private final Type type;

    private final Engine engine;

    public Type getType() {
        return type;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public Vehicle clone() throws CloneNotSupportedException {
        return (Vehicle) super.clone();
    }

}
