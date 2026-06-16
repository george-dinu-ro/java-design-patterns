package my.work.creational.abstr.factory.factory;

import my.work.creational.abstr.factory.vehicle.electric.ElectricVehicle;
import my.work.creational.abstr.factory.vehicle.electric.ExpensiveElectricVehicle;
import my.work.creational.abstr.factory.vehicle.thermal.ExpensiveThermalVehicle;
import my.work.creational.abstr.factory.vehicle.thermal.ThermalVehicle;

public class ExpensiveVehicleFactory implements VehicleFactory {

    @Override
    public ThermalVehicle createThermalVehicle() {
        return new ExpensiveThermalVehicle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new ExpensiveElectricVehicle();
    }

}
