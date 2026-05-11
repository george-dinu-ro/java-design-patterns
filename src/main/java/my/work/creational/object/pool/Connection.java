package my.work.creational.object.pool;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Connection {

    private static final Logger LOGGER = Logger.getLogger(Connection.class.getName());

    public void execute(String query) {
        LOGGER.log(Level.INFO, "Executing query: {0}", query);
    }

}
