package my.work.creational.factory.factory;

import my.work.creational.factory.vehicle.Car;
import my.work.creational.factory.vehicle.Vehicle;

public class CarFactory implements VehicleFactory {

    public static Vehicle buildVehicle() {
        return new CarFactory().createVehicle();
    }

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

}
