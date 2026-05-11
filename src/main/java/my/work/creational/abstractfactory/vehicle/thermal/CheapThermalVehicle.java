package my.work.creational.abstractfactory.vehicle.thermal;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CheapThermalVehicle implements ThermalVehicle {

    private static final Logger LOGGER = Logger.getLogger(CheapThermalVehicle.class.getName());

    @Override
    public void startEngine() {
        LOGGER.log(Level.INFO, "Cheap thermal vehicle engine started");
    }

    @Override
    public void stopEngine() {
        LOGGER.log(Level.INFO, "Cheap thermal vehicle engine stopped");
    }

}
