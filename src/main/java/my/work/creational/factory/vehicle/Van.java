package my.work.creational.factory.vehicle;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Van implements Vehicle {

    private static final Logger LOGGER = Logger.getLogger(Van.class.getName());

    @Override
    public void startEngine() {
        LOGGER.log(Level.INFO, "Van engine started");
    }

    @Override
    public void stopEngine() {
        LOGGER.log(Level.INFO, "Van engine stopped");
    }

}
