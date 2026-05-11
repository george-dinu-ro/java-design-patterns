package my.work.creational.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.Test;

class DoubleCheckedSynchronizedSingletonTest {

    @Test
    void whenCallGetInstanceFromDifferentThreads_thenShouldReturnSameInstance() throws InterruptedException, ExecutionException {

        try (var executor = Executors.newFixedThreadPool(2)) {
            var instance1 = executor.submit(DoubleCheckedSynchronizedSingleton::getInstance).get();
            var instance2 = executor.submit(DoubleCheckedSynchronizedSingleton::getInstance).get();

            assertThat(instance1)
                    .isSameAs(instance2);
        }
    }

}
