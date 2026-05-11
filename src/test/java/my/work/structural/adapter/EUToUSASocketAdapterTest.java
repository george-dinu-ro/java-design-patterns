package my.work.structural.adapter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EUToUSASocketAdapterTest {

    @Test
    void givenEUVoltage_whenUseAdapter_thenTransformToUSAVoltage() {
        EUSocket euSocket = () -> 230;
        var adapter = new EUToUSASocketAdapter(euSocket);

        assertThat(euSocket.getVoltage())
                .isEqualTo(230);

        assertThat(adapter.getVoltage())
                .isEqualTo(110);
    }

}
