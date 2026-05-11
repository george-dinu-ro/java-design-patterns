package my.work.structural.bridge.engine;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EconomicEngine implements Engine {

    private static final Logger LOGGER = Logger.getLogger(EconomicEngine.class.getName());

    @Override
    public void run() {
        LOGGER.log(Level.INFO, "Economic engine running");
    }

}
