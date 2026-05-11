package my.work.structural.facade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarFacadeTest {

    private static CarFacade carFacade;

    @BeforeEach
    void init() {
        carFacade = new CarFacade(new Engine(), new Battery(), new Oil(), new Water());
    }

    @Test
    void beforeRotateKey_nothingChanged() {
        assertThat(carFacade.getBattery().isChecked())
                .isFalse();

        assertThat(carFacade.getOil().isChecked())
                .isFalse();

        assertThat(carFacade.getWater().isChecked())
                .isFalse();

        assertThat(carFacade.getEngine().isStarted())
                .isFalse();
    }

    @Test
    void afterRotateKey_allChanged() {
        carFacade.rotateKey();

        assertThat(carFacade.getBattery().isChecked())
                .isTrue();

        assertThat(carFacade.getOil().isChecked())
                .isTrue();

        assertThat(carFacade.getWater().isChecked())
                .isTrue();

        assertThat(carFacade.getEngine().isStarted())
                .isTrue();
    }

}