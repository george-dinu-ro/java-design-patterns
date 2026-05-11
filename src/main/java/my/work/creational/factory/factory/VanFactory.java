package my.work.creational.factory.factory;

import my.work.creational.factory.vehicle.Van;
import my.work.creational.factory.vehicle.Vehicle;

public class VanFactory implements VehicleFactory {

    public static Vehicle buildVehicle() {
        return new VanFactory().createVehicle();
    }

    @Override
    public Vehicle createVehicle() {
        return new Van();
    }

}
