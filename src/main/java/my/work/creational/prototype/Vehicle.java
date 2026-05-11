package my.work.creational.prototype;

public interface Vehicle {

    enum VehicleType {
        CAR, VAN, TRUCK
    }

    enum Color {
        RED, GREEN, BLUE, BLACK, WHITE
    }

    enum Engine {
        PETROL, DIESEL, ELECTRIC
    }

    void setEngine(Engine engine);

    void setColor(Color color);

    Vehicle clone(Color color);

}
