package my.work.structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

public class CarCache {

    private final Map<Vehicle.Color, Car> cache = new EnumMap<>(Vehicle.Color.class);

    public Car getCar(Vehicle.Color color) {
        return cache.computeIfAbsent(color, Car::new);
    }

    public int getSize() {
        return cache.size();
    }

}
