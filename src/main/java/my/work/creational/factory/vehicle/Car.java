package my.work.creational.factory.vehicle;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Car implements Vehicle {

    private static final Logger LOGGER = Logger.getLogger(Car.class.getName());

    @Override
    public void startEngine() {
        LOGGER.log(Level.INFO, "Car engine started");
    }

    @Override
    public void stopEngine() {
        LOGGER.log(Level.INFO, "Car engine stopped");
    }

}
