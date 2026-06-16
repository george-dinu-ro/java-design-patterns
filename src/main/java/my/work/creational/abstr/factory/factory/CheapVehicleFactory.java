package my.work.creational.abstr.factory.factory;

import my.work.creational.abstr.factory.vehicle.electric.CheapElectricVehicle;
import my.work.creational.abstr.factory.vehicle.electric.ElectricVehicle;
import my.work.creational.abstr.factory.vehicle.thermal.CheapThermalVehicle;
import my.work.creational.abstr.factory.vehicle.thermal.ThermalVehicle;

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
