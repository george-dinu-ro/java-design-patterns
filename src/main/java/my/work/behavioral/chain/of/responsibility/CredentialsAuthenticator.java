package my.work.behavioral.chain.of.responsibility;

import java.util.Objects;

public class CredentialsAuthenticator implements Authenticator {

    private final Authenticator nextAuthenticator;

    public CredentialsAuthenticator(Authenticator nextAuthenticator) {
        this.nextAuthenticator = nextAuthenticator;
    }

    @Override
    public boolean isAuthenticated(User user) {
        return hasValidCredentials(user)
                || (hasNextAuthenticator(nextAuthenticator) && nextAuthenticator.isAuthenticated(user));
    }

    private static boolean hasValidCredentials(User user) {
        return Objects.nonNull(user.getUsername())
                && !user.getUsername().isEmpty()
                && Objects.nonNull(user.getPassword())
                && !user.getPassword().isEmpty();
    }

}
