package my.work.creational.factory.vehicle;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Truck implements Vehicle {

    private static final Logger LOGGER = Logger.getLogger(Truck.class.getName());

    @Override
    public void startEngine() {
        LOGGER.log(Level.INFO, "Truck engine started");
    }

    @Override
    public void stopEngine() {
        LOGGER.log(Level.INFO, "Truck engine stopped");
    }

}
