package my.work.structural.adapter;

public interface USASocket {

    default int getVoltage() {
        return 120;
    }

}
