package my.work.behavioral.strategy;

import java.util.UUID;

public class StrongRandomGenerator implements RandomGeneratorAlgorithm {

    @Override
    public String generate() {
        try {
            Thread.sleep(500);
            return "strong".concat(UUID.randomUUID().toString());

        } catch (InterruptedException _) {
            Thread.currentThread().interrupt();
            return null;
        }
    }
}
