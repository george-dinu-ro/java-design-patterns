package my.work.structural.flyweight;

public class Car implements Vehicle {

    private final Color color;

    public Car(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

}
