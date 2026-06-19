package my.work.behavioral.chain.of.responsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AuthenticatorTest {

    private Authenticator authenticator;

    private User user;

    @BeforeEach
    void init() {
        authenticator = new OauthAuthenticator(new CredentialsAuthenticator(null));
        user = new User();
    }

    @Test
    void givenOauthAuthenticatedUser_whenCheckAuthentication_thenSuccess() {
        this.user.setToken("token");

        var isAuthenticated = authenticator.isAuthenticated(user);

        assertThat(isAuthenticated)
                .isTrue();
    }

    @Test
    void givenCredentialsAuthenticatedUser_whenCheckAuthentication_thenSuccess() {
        this.user.setUsername("username");
        this.user.setPassword("password");

        var isAuthenticated = authenticator.isAuthenticated(user);

        assertThat(isAuthenticated)
                .isTrue();
    }

    @Test
    void givenNotAuthenticatedUser_whenCheckAuthentication_thenFailure() {
        var isAuthenticated = authenticator.isAuthenticated(user);

        assertThat(isAuthenticated)
                .isFalse();
    }

}