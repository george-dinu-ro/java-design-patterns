package my.work.behavioral.chain.of.responsibility;

import java.util.Objects;

public class OauthAuthenticator implements Authenticator {

    private final Authenticator nextAuthenticator;

    public OauthAuthenticator(Authenticator nextAuthenticator) {
        this.nextAuthenticator = nextAuthenticator;
    }

    @Override
    public boolean isAuthenticated(User user) {
        return hasValidToken(user)
                || (hasNextAuthenticator(nextAuthenticator) && nextAuthenticator.isAuthenticated(user));
    }

    private static boolean hasValidToken(User user) {
        return Objects.nonNull(user.getToken())
                && !user.getToken().trim().isEmpty();
    }

}
