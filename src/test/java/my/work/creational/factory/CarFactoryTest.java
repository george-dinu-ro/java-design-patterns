package my.work.creational.factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import my.work.creational.factory.factory.CarFactory;
import my.work.creational.factory.vehicle.Car;

class CarFactoryTest {

    @Test
    void whenCallBuildVehicle_thenReturnCar() {
        var car = CarFactory.buildVehicle();
        car.startEngine();
        car.stopEngine();

        assertThat(car)
                .isInstanceOf(Car.class);
    }

    @Test
    void whenCallCreateVehicle_thenReturnCar() {
        var carFactory = new CarFactory();
        var car = carFactory.createVehicle();
        car.startEngine();
        car.stopEngine();

        assertThat(car)
                .isInstanceOf(Car.class);
    }

}
