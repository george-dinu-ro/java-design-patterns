package my.work.behavioral.chain.of.responsibility;

import java.util.Objects;

public interface Authenticator {

    boolean isAuthenticated(User user);

    default boolean hasNextAuthenticator(Authenticator nextAuthenticator) {
        return Objects.nonNull(nextAuthenticator);
    }

}
