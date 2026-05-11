package my.work.creational.singleton;

public class StaticClassSingleton {

    private StaticClassSingleton() {
    }

    private static class SingletonHelper {
        private static final StaticClassSingleton INSTANCE = new StaticClassSingleton();
    }

    public static StaticClassSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

}
