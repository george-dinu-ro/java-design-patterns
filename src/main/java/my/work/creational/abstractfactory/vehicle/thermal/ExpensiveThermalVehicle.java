package my.work.creational.abstractfactory.vehicle.thermal;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExpensiveThermalVehicle implements ThermalVehicle {

    private static final Logger LOGGER = Logger.getLogger(ExpensiveThermalVehicle.class.getName());

    @Override
    public void startEngine() {
        LOGGER.log(Level.INFO, "Expensive thermal vehicle engine started");
    }

    @Override
    public void stopEngine() {
        LOGGER.log(Level.INFO, "Expensive thermal vehicle engine stopped");
    }

}
