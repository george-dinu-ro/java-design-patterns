package my.work.creational.prototype;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import my.work.creational.prototype.Vehicle.Color;
import my.work.creational.prototype.Vehicle.Engine;
import my.work.creational.prototype.Vehicle.VehicleType;

class TruckTest {

    @Test
    void whenCloneTruck_thenOnlyColorMayBeChanged() {
        var originalTruck = new Truck(Engine.DIESEL, Color.BLACK);
        var clonedTruck = (Truck) originalTruck.clone(Vehicle.Color.GREEN);

        assertThat(originalTruck.getType())
                .isEqualTo(VehicleType.TRUCK);

        assertThat(originalTruck.getEngine())
                .isEqualTo(Engine.DIESEL);

        assertThat(originalTruck.getColor())
                .isEqualTo(Color.BLACK);

        assertThat(clonedTruck.getType())
                .isEqualTo(VehicleType.TRUCK);

        assertThat(clonedTruck.getEngine())
                .isEqualTo(Engine.DIESEL);

        assertThat(clonedTruck.getColor())
                .isEqualTo(Color.GREEN);
    }

}
