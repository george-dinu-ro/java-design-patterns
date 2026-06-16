package my.work.creational.abstr.factory.factory;

import my.work.creational.abstr.factory.vehicle.electric.ElectricVehicle;
import my.work.creational.abstr.factory.vehicle.thermal.ThermalVehicle;

public interface VehicleFactory {

    ThermalVehicle createThermalVehicle();

    ElectricVehicle createElectricVehicle();

}
