package my.work.structural.bridge.engine;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PowerfulEngine implements Engine {

    private static final Logger LOGGER = Logger.getLogger(PowerfulEngine.class.getName());

    @Override
    public void run() {
        LOGGER.log(Level.INFO, "Powerful engine running");
    }

}
