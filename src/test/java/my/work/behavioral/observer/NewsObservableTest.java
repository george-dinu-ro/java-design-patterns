package my.work.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NewsObservableTest {

    @Test
    void whenObservableNotifiesObservers_thenAllObserversReceiveNotification() {
        var observable = new NewsObservable();
        var observer1 = new NewsObserver();
        var observer2 = new NewsObserver();
        var observer3 = new NewsObserver();

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        observable.deleteObserver(observer2);

        var message = new Object();
        observable.notifyObservers(message);

        assertThat(observer1.getMessage())
                .isEqualTo(message);

        assertThat(observer2.getMessage())
                .isNull();

        assertThat(observer3.getMessage())
                .isEqualTo(message);
    }

}