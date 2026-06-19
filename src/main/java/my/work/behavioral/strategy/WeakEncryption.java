package my.work.behavioral.strategy;

import java.util.UUID;

public class WeakEncryption implements EncryptionAlgorithm {

    @Override
    public String encrypt(String message) {
        return "weak".concat(UUID.randomUUID().toString());
    }

}
