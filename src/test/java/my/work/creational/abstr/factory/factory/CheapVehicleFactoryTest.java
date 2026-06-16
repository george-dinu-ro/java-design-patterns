package my.work.creational.abstr.factory.factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import my.work.creational.abstr.factory.vehicle.electric.CheapElectricVehicle;
import my.work.creational.abstr.factory.vehicle.thermal.CheapThermalVehicle;

class CheapVehicleFactoryTest {

    private static CheapVehicleFactory factory;

    @BeforeAll
    static void init() {
        factory = new CheapVehicleFactory();
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
