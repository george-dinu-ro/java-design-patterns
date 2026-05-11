package my.work.creational.object.pool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionManager {

    protected static final int MAX_CONNECTIONS_NUMBER = 5;

    private final List<Connection> availableConnections = new ArrayList<>();

    private final List<Connection> usedConnections = new ArrayList<>();

    public synchronized Connection getConnection() {
        return isConnectionAvailable() ? getAvailableConnection() : createNewConnection();
    }

    public synchronized void releaseConnection(Connection connection) {
        var connectionWasRemoved = usedConnections.remove(connection);

        if (connectionWasRemoved) {
            availableConnections.add(connection);
        }
    }

    public synchronized int getAvailableConnectionsNumber() {
        return availableConnections.size();
    }

    public synchronized int getUsedConnectionsNumber() {
        return usedConnections.size();
    }

    private boolean isConnectionAvailable() {
        return !availableConnections.isEmpty();
    }

    private Connection getAvailableConnection() {
        var connection = availableConnections.removeLast();
        usedConnections.add(connection);

        return connection;
    }

    private Connection createNewConnection() {
        return isConnectionLimitReached() ? null : createConnection();
    }

    private boolean isConnectionLimitReached() {
        return ((usedConnections.size() + availableConnections.size()) >= MAX_CONNECTIONS_NUMBER);
    }

    private Connection createConnection() {
        var connection = new Connection();
        usedConnections.add(connection);

        return connection;
    }

}
