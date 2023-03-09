import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VolumeTest {

    @Test
    public void shouldSetVolume() {
        Volume vol = new Volume();

        vol.setCurrentVolume(4);

        int expected = 4;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Volume vol = new Volume();

        vol.setCurrentVolume(100);

        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume() {
        Volume vol = new Volume();

        vol.setCurrentVolume(0);

        vol.decreaseVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}