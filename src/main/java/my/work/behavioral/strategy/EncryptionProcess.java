package my.work.behavioral.strategy;

public class EncryptionProcess {

    public String encrypt(EncryptionAlgorithm encryptionAlgorithm, String plainText) {
        return encryptionAlgorithm.encrypt(plainText);
    }

}
