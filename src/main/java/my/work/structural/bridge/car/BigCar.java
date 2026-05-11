package my.work.structural.bridge.car;

import my.work.structural.bridge.engine.Engine;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BigCar extends Car {

    private static final Logger LOGGER = Logger.getLogger(BigCar.class.getName());

    public BigCar(Engine engine) {
        super(engine);
    }

    @Override
    public void checkEngine() {
        LOGGER.log(Level.INFO, "Big car");
        engine.run();
    }

}
