package my.work.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomGeneratorProcessTest {

    @Test
    void whenEncrypt_thenUseRuntimeAlgorithm() {
        var weakEncryptionAlgorithm = new WeakRandomGenerator();
        var strongEncryptionAlgorithm = new StrongRandomGenerator();
        var encryptionProcess = new RandomGeneratorProcess();

        var weakResult = encryptionProcess.encrypt(weakEncryptionAlgorithm);
        var strongResult = encryptionProcess.encrypt(strongEncryptionAlgorithm);

        assertThat(weakResult)
                .isNotNull()
                .startsWith("weak");

        assertThat(strongResult)
                .isNotNull()
                .startsWith("strong");
    }
}