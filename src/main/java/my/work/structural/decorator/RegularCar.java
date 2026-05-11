package my.work.structural.decorator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RegularCar implements Car {

    private static final Logger LOGGER = Logger.getLogger(RegularCar.class.getName());

    @Override
    public void start() {
        LOGGER.log(Level.INFO, "Car started");
    }

    @Override
    public void stop() {
        LOGGER.log(Level.INFO, "Car stopped");
    }

}
