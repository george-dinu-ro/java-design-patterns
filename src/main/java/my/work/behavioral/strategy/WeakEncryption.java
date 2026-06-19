package my.work.behavioral.strategy;

import my.work.behavioral.EncryptionAlgorithm;

import java.util.UUID;

public class WeakEncryption implements EncryptionAlgorithm {

    @Override
    public String encrypt(String message) {
        return "weak".concat(UUID.randomUUID().toString());
    }

}
