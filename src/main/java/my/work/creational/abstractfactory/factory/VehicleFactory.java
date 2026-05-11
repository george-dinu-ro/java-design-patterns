package my.work.creational.abstractfactory.factory;

import my.work.creational.abstractfactory.vehicle.electric.ElectricVehicle;
import my.work.creational.abstractfactory.vehicle.thermal.ThermalVehicle;

public interface VehicleFactory {

    ThermalVehicle createThermalVehicle();

    ElectricVehicle createElectricVehicle();

}
