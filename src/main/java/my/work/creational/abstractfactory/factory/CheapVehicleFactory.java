package my.work.creational.abstractfactory.factory;

import my.work.creational.abstractfactory.vehicle.electric.CheapElectricVehicle;
import my.work.creational.abstractfactory.vehicle.electric.ElectricVehicle;
import my.work.creational.abstractfactory.vehicle.thermal.CheapThermalVehicle;
import my.work.creational.abstractfactory.vehicle.thermal.ThermalVehicle;

public class CheapVehicleFactory implements VehicleFactory {

    @Override
    public ThermalVehicle createThermalVehicle() {
        return new CheapThermalVehicle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new CheapElectricVehicle();
    }

}
