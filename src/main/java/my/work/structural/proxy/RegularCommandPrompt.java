package my.work.structural.proxy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RegularCommandPrompt implements Console {

    private static final Logger LOGGER = Logger.getLogger(RegularCommandPrompt.class.getName());

    @Override
    public boolean executeCommand(String command) {
        LOGGER.log(Level.INFO, () -> "Executing command: " + command);

        return true;
    }

}
