package my.work.structural.flyweight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarCacheTest {

    @Test
    void whenCacheObjects_createsOneInstanceByColor() {
        var cache = new CarCache();

        var greenCar = cache.getCar(Vehicle.Color.GREEN);
        var redCar = cache.getCar(Vehicle.Color.RED);
        var anotherGreenCar = cache.getCar(Vehicle.Color.GREEN);

        assertThat(greenCar)
                .isSameAs(anotherGreenCar)
                .isNotSameAs(redCar);

        assertThat(greenCar.getColor())
                .isEqualTo(Vehicle.Color.GREEN);

        assertThat(redCar.getColor())
                .isEqualTo(Vehicle.Color.RED);

        assertThat(anotherGreenCar.getColor())
                .isEqualTo(Vehicle.Color.GREEN);

        assertThat(cache.getSize())
                .isEqualTo(2);
    }

}