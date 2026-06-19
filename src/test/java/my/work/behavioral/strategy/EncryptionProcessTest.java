package my.work.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EncryptionProcessTest {

    @Test
    void whenEncrypt_thenUseRuntimeAlgorithm() {
        var weakEncryptionAlgorithm = new WeakEncryption();
        var strongEncryptionAlgorithm = new StrongEncryption();
        var encryptionProcess = new EncryptionProcess();

        var input = "dummy";
        var weakResult = encryptionProcess.encrypt(weakEncryptionAlgorithm, input);
        var strongResult = encryptionProcess.encrypt(strongEncryptionAlgorithm, input);

        assertThat(weakResult)
                .isNotNull()
                .startsWith("weak");

        assertThat(strongResult)
                .isNotNull()
                .startsWith("strong");
    }
}