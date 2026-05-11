package my.work.structural.bridge.car;

import my.work.structural.bridge.engine.PowerfulEngine;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BigCarTest {

    @Test
    void whenDescribeCar_thenGetRightElements() {
        var car = new BigCar(new PowerfulEngine());
        car.checkEngine();

        assertThat(car.getClass())
                .isEqualTo(BigCar.class);

        assertThat(car.getEngine().getClass())
                .isEqualTo(PowerfulEngine.class);
    }

}