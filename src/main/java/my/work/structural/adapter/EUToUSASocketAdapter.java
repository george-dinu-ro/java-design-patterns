package my.work.structural.adapter;

public class EUToUSASocketAdapter implements USASocket {

    private final EUSocket euSocket;

    public EUToUSASocketAdapter(EUSocket euSocket) {
        this.euSocket = euSocket;
    }

    @Override
    public int getVoltage() {
        return ((euSocket.getVoltage() + 10) / 2);
    }

}
