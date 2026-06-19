package my.work.behavioral.strategy;

import java.util.UUID;

public class StrongEncryption implements EncryptionAlgorithm {

    @Override
    public String encrypt(String message) {
        try {
            Thread.sleep(500);
            return "strong".concat(UUID.randomUUID().toString());

        } catch (InterruptedException _) {
            Thread.currentThread().interrupt();
            return null;
        }
    }
}
