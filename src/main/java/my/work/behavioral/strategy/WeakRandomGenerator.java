package my.work.behavioral.strategy;

import java.util.UUID;

public class WeakRandomGenerator implements RandomGeneratorAlgorithm {

    @Override
    public String generate() {
        return "weak".concat(UUID.randomUUID().toString());
    }

}
