package my.work.creational.singleton;

import java.io.Serial;
import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private SerializableSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializableSingleton INSTANCE = new SerializableSingleton();
    }

    public static SerializableSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    @Serial
    protected Object readResolve() {
        return getInstance();
    }

}
