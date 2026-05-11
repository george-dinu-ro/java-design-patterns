package my.work.structural.proxy;

import java.util.stream.Stream;

import org.junit.jupiter.params.provider.Arguments;

class TestUtils {

    static Stream<Arguments> providingSuccessfulCombinations() {
        return Stream.of(
                Arguments.of(false, "ls"),
                Arguments.of(true, "ls"),
                Arguments.of(true, "rm"));
    }

}
