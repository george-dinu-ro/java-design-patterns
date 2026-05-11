package my.work.creational.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SingleThreadSingletonTest {

    @Test
    void whenCallGetInstanceTwice_thenShouldReturnSameInstance() {
        var instance1 = SingleThreadSingleton.getInstance();
        var instance2 = SingleThreadSingleton.getInstance();

        assertThat(instance1)
                .isSameAs(instance2);
    }

}
