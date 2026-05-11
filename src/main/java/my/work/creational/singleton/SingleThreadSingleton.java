package my.work.creational.singleton;

public class SingleThreadSingleton {

    private static SingleThreadSingleton instance;

    private SingleThreadSingleton() {
    }

    public static SingleThreadSingleton getInstance() {
        if (instance == null) {
            instance = new SingleThreadSingleton();
        }

        return instance;
    }

}
