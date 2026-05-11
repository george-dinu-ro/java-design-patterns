package my.work.creational.abstractfactory.factory;

import my.work.creational.abstractfactory.vehicle.electric.ElectricVehicle;
import my.work.creational.abstractfactory.vehicle.electric.ExpensiveElectricVehicle;
import my.work.creational.abstractfactory.vehicle.thermal.ExpensiveThermalVehicle;
import my.work.creational.abstractfactory.vehicle.thermal.ThermalVehicle;

public class ExpensiveVehicleFactory implements my.work.creational.abstractfactory.factory.VehicleFactory {

    @Override
    public ThermalVehicle createThermalVehicle() {
        return new ExpensiveThermalVehicle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new ExpensiveElectricVehicle();
    }

}
