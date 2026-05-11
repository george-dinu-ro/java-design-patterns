package my.work.creational.abstractfactory.factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import my.work.creational.abstractfactory.vehicle.electric.CheapElectricVehicle;
import my.work.creational.abstractfactory.vehicle.thermal.CheapThermalVehicle;

class CheapVehicleFactoryTest {

    private static my.work.creational.abstractfactory.factory.CheapVehicleFactory factory;

    @BeforeAll
    static void init() {
        factory = new my.work.creational.abstractfactory.factory.CheapVehicleFactory();
    }

    @Test
    void whenCallCreateThermalVehicle_thenReturnCheapThermalVehicle() {
        var vehicle = factory.createThermalVehicle();
        vehicle.startEngine();
        vehicle.stopEngine();

        assertThat(vehicle)
                .isInstanceOf(CheapThermalVehicle.class);
    }

    @Test
    void whenCallCreateElectricVehicle_thenReturnCheapElectricVehicle() {
        var vehicle = factory.createElectricVehicle();
        vehicle.start();
        vehicle.stop();

        assertThat(vehicle)
                .isInstanceOf(CheapElectricVehicle.class);
    }

}
