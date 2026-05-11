package my.work.creational.prototype;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import my.work.creational.prototype.Vehicle.Color;
import my.work.creational.prototype.Vehicle.Engine;
import my.work.creational.prototype.Vehicle.VehicleType;

class CarTest {

    @Test
    void whenCloneCar_thenOnlyColorMayBeChanged() {
        var originalCar = new Car(Engine.PETROL, Color.RED);
        var clonedCar = (Car) originalCar.clone(Color.GREEN);

        assertThat(originalCar.getType())
                .isEqualTo(VehicleType.CAR);

        assertThat(originalCar.getEngine())
                .isEqualTo(Engine.PETROL);

        assertThat(originalCar.getColor())
                .isEqualTo(Color.RED);

        assertThat(clonedCar.getType())
                .isEqualTo(VehicleType.CAR);

        assertThat(clonedCar.getEngine())
                .isEqualTo(Engine.PETROL);

        assertThat(clonedCar.getColor())
                .isEqualTo(Color.GREEN);
    }

}
