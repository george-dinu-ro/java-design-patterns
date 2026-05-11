package my.work.structural.decorator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TuningDecorator extends CarDecorator {

    private static final Logger LOGGER = Logger.getLogger(TuningDecorator.class.getName());

    public TuningDecorator(Car car) {
        super(car);
    }

    @Override
    public void start() {
        car.start();
    }

    @Override
    public void stop() {
        car.stop();
    }

    @Override
    public void decorate() {
        LOGGER.log(Level.INFO, "Car tuned");
    }

}
