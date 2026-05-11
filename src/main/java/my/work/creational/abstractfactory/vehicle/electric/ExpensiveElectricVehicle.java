package my.work.creational.abstractfactory.vehicle.electric;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExpensiveElectricVehicle implements ElectricVehicle {

    private static final Logger LOGGER = Logger.getLogger(ExpensiveElectricVehicle.class.getName());

    @Override
    public void start() {
        LOGGER.log(Level.INFO, "Expensive Electric Vehicle started");
    }

    @Override
    public void stop() {
        LOGGER.log(Level.INFO, "Expensive Electric Vehicle stopped");
    }

}
