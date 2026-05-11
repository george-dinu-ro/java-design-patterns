package my.work.creational.abstractfactory.vehicle.electric;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CheapElectricVehicle implements my.work.creational.abstractfactory.vehicle.electric.ElectricVehicle {

    private static final Logger LOGGER = Logger.getLogger(CheapElectricVehicle.class.getName());

    @Override
    public void start() {
        LOGGER.log(Level.INFO, "Cheap Electric Vehicle started");
    }

    @Override
    public void stop() {
        LOGGER.log(Level.INFO, "Cheap Electric Vehicle stopped");
    }

}
