package my.work.creational.prototype;

public class Truck implements Vehicle {

    private final VehicleType type;

    private Engine engine;

    private Color color;

    public Truck(Engine engine, Color color) {
        this.type = VehicleType.TRUCK;
        this.engine = engine;
        this.color = color;
    }

    public VehicleType getType() {
        return type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Vehicle clone(Color color) {
        return new Truck(this.engine, color);
    }

    @Override
    public String toString() {
        return "Truck [type=" + type + ", engine=" + engine + ", color=" + color + "]";
    }

}
