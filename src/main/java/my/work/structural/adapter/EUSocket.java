package my.work.structural.adapter;

public interface EUSocket {

    default int getVoltage() {
        return 230;
    }

}
