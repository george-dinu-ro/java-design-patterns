package my.work.creational.factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import my.work.creational.factory.factory.TruckFactory;
import my.work.creational.factory.vehicle.Truck;

class TruckFactoryTest {

    @Test
    void whenCallBuildVehicle_thenReturnTruck() {
        var truck = TruckFactory.buildVehicle();
        truck.startEngine();
        truck.stopEngine();

        assertThat(truck)
                .isInstanceOf(Truck.class);
    }

    @Test
    void whenCallCreateVehicle_thenReturnTruck() {
        var truckFactory = new TruckFactory();
        var truck = truckFactory.createVehicle();
        truck.startEngine();
        truck.stopEngine();

        assertThat(truck)
                .isInstanceOf(Truck.class);
    }

}
