package my.work.creational.abstractfactory.factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import my.work.creational.abstractfactory.vehicle.electric.ExpensiveElectricVehicle;
import my.work.creational.abstractfactory.vehicle.thermal.ExpensiveThermalVehicle;

class ExpensiveVehicleFactoryTest {

    private static my.work.creational.abstractfactory.factory.ExpensiveVehicleFactory factory;

    @BeforeAll
    static void init() {
        factory = new my.work.creational.abstractfactory.factory.ExpensiveVehicleFactory();
    }

    @Test
    void whenCallCreateThermalVehicle_thenReturnExpensiveThermalVehicle() {
        var vehicle = factory.createThermalVehicle();
        vehicle.startEngine();
        vehicle.stopEngine();

        assertThat(vehicle)
                .isInstanceOf(ExpensiveThermalVehicle.class);
    }

    @Test
    void whenCallCreateElectricVehicle_thenReturnExpensiveElectricVehicle() {
        var vehicle = factory.createElectricVehicle();
        vehicle.start();
        vehicle.stop();

        assertThat(vehicle)
                .isInstanceOf(ExpensiveElectricVehicle.class);
    }

}
