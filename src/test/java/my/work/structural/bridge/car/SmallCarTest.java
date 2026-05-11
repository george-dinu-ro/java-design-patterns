package my.work.structural.bridge.car;

import my.work.structural.bridge.engine.EconomicEngine;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SmallCarTest {

    @Test
    void whenDescribeCar_thenGetRightElements() {
        var car = new SmallCar(new EconomicEngine());
        car.checkEngine();

        assertThat(car.getClass())
                .isEqualTo(SmallCar.class);

        assertThat(car.getEngine().getClass())
                .isEqualTo(EconomicEngine.class);
    }

}