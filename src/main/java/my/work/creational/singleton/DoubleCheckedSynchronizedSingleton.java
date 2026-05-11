package my.work.creational.singleton;

public class DoubleCheckedSynchronizedSingleton {

    private static volatile DoubleCheckedSynchronizedSingleton instance;

    private DoubleCheckedSynchronizedSingleton() {
    }

    public static DoubleCheckedSynchronizedSingleton getInstance() {
        var localInstance = instance;

        if (localInstance == null) {
            synchronized (DoubleCheckedSynchronizedSingleton.class) {
                localInstance = instance;

                if (localInstance == null) {
                    instance = localInstance = new DoubleCheckedSynchronizedSingleton();
                }
            }
        }

        return localInstance;
    }
}
