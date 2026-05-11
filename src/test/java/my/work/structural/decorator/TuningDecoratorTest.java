package my.work.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TuningDecoratorTest {

    @Test
    void whenCreateDecorator_thenImproveOriginal() {
        var original = new RegularCar();
        var decorated = new TuningDecorator(original);
        decorated.decorate();

        assertThat(decorated.getOriginalCar())
                .isEqualTo(original);
    }

}