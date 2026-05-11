package my.work.creational.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.jupiter.api.Test;

class SerializableSingletonTest {

    @Test
    void whenDeserializeSerializedInstance_thenShouldReturnSameInstance() throws IOException, ClassNotFoundException {

        var instance1 = SerializableSingleton.getInstance();
        SerializableSingleton instance2;

        try (var output = new ObjectOutputStream(new FileOutputStream("file.ser"))) {
            output.writeObject(instance1);
        }

        try (var input = new ObjectInputStream(new FileInputStream("file.ser"))) {
            instance2 = (SerializableSingleton) input.readObject();
        }

        assertThat(instance1)
                .isSameAs(instance2);
    }

}
