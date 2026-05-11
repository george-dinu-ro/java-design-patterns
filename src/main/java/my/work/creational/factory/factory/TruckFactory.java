package my.work.creational.factory.factory;

import my.work.creational.factory.vehicle.Truck;
import my.work.creational.factory.vehicle.Vehicle;

public class TruckFactory implements VehicleFactory {

    public static Vehicle buildVehicle() {
        return new TruckFactory().createVehicle();
    }

    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }

}
