package my.work.structural.adapter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EUToUSASocketAdapterTest {

    @Test
    void givenEUVoltage_whenUseAdapter_thenTransformToUSAVoltage() {
        var euSocket = new EUSocket() {
            @Override
            public int getVoltage() {
                return EUSocket.super.getVoltage();
            }
        };
        var adapter = new EUToUSASocketAdapter(euSocket);

        assertThat(euSocket.getVoltage())
                .isEqualTo(230);

        assertThat(adapter.getVoltage())
                .isEqualTo(120);
    }

}
