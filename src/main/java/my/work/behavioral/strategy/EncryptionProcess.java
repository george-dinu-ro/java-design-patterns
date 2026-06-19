package my.work.behavioral.strategy;

import my.work.behavioral.EncryptionAlgorithm;

public class EncryptionProcess {

    public String encrypt(EncryptionAlgorithm encryptionAlgorithm, String plainText) {
        return encryptionAlgorithm.encrypt(plainText);
    }

}
