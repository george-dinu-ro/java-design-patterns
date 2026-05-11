package my.work.structural.bridge.car;

import my.work.structural.bridge.engine.Engine;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SmallCar extends Car {

    private static final Logger LOGGER = Logger.getLogger(SmallCar.class.getName());

    public SmallCar(Engine engine) {
        super(engine);
    }

    @Override
    public void checkEngine() {
        LOGGER.log(Level.INFO, "Small car");
        engine.run();
    }

}
