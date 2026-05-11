package my.work.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VehicleTest {

    @Test
    void whenCloneObject_thenGetNewInstance() throws CloneNotSupportedException {
        var original = new Vehicle(Vehicle.Type.CAR, Vehicle.Engine.ECONOMIC);
        var cloned = original.clone();

        assertThat(original)
                .isNotEqualTo(cloned);

        assertThat(original.getType())
                .isEqualTo(cloned.getType());

        assertThat(original.getEngine())
                .isEqualTo(cloned.getEngine());
    }

}