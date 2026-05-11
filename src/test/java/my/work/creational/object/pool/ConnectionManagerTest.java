package my.work.creational.object.pool;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConnectionManagerTest {

    private ConnectionManager connectionManager;

    @BeforeEach
    void init() {
        connectionManager = new ConnectionManager();
    }

    @Test
    void givenNotAvailableConnectionsAndNotUsedConnections_whenCallGetConnection_thenCreateNewConnection() {
        var connection = connectionManager.getConnection();

        assertThat(connection)
                .isNotNull();

        assertThat(connectionManager.getAvailableConnectionsNumber())
                .isZero();

        assertThat(connectionManager.getUsedConnectionsNumber())
                .isOne();

        connectionManager.releaseConnection(connection);

        assertThat(connectionManager.getAvailableConnectionsNumber())
                .isOne();

        assertThat(connectionManager.getUsedConnectionsNumber())
                .isZero();
    }

    @Test
    void givenNotAvailableConnectionsAndSomeUsedConnections_whenCallGetConnection_thenCreateNewConnection() {
        connectionManager.getConnection();
        connectionManager.getConnection();
        connectionManager.getConnection();

        var connection = connectionManager.getConnection();

        assertThat(connection)
                .isNotNull();

        assertThat(connectionManager.getAvailableConnectionsNumber())
                .isZero();

        assertThat(connectionManager.getUsedConnectionsNumber())
                .isEqualTo(4);

        connectionManager.releaseConnection(connection);

        assertThat(connectionManager.getAvailableConnectionsNumber())
                .isOne();

        assertThat(connectionManager.getUsedConnectionsNumber())
                .isEqualTo(3);
    }

    @Test
    void givenAvailableConnectionsAndNotUsedConnections_whenCallGetConnection_thenGetOneAvailableConnection() {
        var usedConnection1 = connectionManager.getConnection();
        var usedConnection2 = connectionManager.getConnection();
        var usedConnection3 = connectionManager.getConnection();

        connectionManager.releaseConnection(usedConnection1);
        connectionManager.releaseConnection(usedConnection2);
        connectionManager.releaseConnection(usedConnection3);

        var connection = connectionManager.getConnection();

        assertThat(connection)
                .isNotNull();

        assertThat(connectionManager.getAvailableConnectionsNumber())
                .isEqualTo(2);

        assertThat(connectionManager.getUsedConnectionsNumber())
                .isOne();

        connectionManager.releaseConnection(connection);

        assertThat(connectionManager.getAvailableConnectionsNumber())
                .isEqualTo(3);

        assertThat(connectionManager.getUsedConnectionsNumber())
                .isZero();
    }

    @Test
    void givenAvailableConnectionsAndSomeUsedConnections_whenCallGetConnection_thenGetOneAvailableConnection() {
        var usedConnection1 = connectionManager.getConnection();
        var usedConnection2 = connectionManager.getConnection();
        connectionManager.getConnection();
        connectionManager.getConnection();

        connectionManager.releaseConnection(usedConnection1);
        connectionManager.releaseConnection(usedConnection2);

        var connection = connectionManager.getConnection();

        assertThat(connection)
                .isNotNull();

        assertThat(connectionManager.getAvailableConnectionsNumber())
                .isOne();

        assertThat(connectionManager.getUsedConnectionsNumber())
                .isEqualTo(3);

        connectionManager.releaseConnection(connection);

        assertThat(connectionManager.getAvailableConnectionsNumber())
                .isEqualTo(2);

        assertThat(connectionManager.getUsedConnectionsNumber())
                .isEqualTo(2);
    }

    @Test
    void givenAllConnectionsAreUsed_whenCallGetConnection_thenReturnNull() {
        IntStream
                .rangeClosed(1, ConnectionManager.MAX_CONNECTIONS_NUMBER)
                .forEach(_ -> connectionManager.getConnection());

        var connection = connectionManager.getConnection();

        assertThat(connection)
                .isNull();

        assertThat(connectionManager.getAvailableConnectionsNumber())
                .isZero();

        assertThat(connectionManager.getUsedConnectionsNumber())
                .isEqualTo(ConnectionManager.MAX_CONNECTIONS_NUMBER);

        connectionManager.releaseConnection(connection);

        assertThat(connectionManager.getAvailableConnectionsNumber())
                .isZero();

        assertThat(connectionManager.getUsedConnectionsNumber())
                .isEqualTo(ConnectionManager.MAX_CONNECTIONS_NUMBER);
    }

}
