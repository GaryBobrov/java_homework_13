import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VolumeTest {

    @Test
    public void shouldSetVolume() {
        Volume vol = new Volume();

        vol.setCurrentVolume(45);

        int expected = 45;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMin() {
        Volume vol = new Volume();

        vol.setCurrentVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMax() {
        Volume vol = new Volume();

        vol.setCurrentVolume(101);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Volume vol = new Volume();

        vol.setCurrentVolume(65);

        vol.increaseVolume();

        int expected = 66;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeMax() {
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

        vol.setCurrentVolume(56);

        vol.decreaseVolume();

        int expected = 55;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeMin() {
        Volume vol = new Volume();

        vol.setCurrentVolume(0);

        vol.decreaseVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Volume vol = new Volume();

        vol.setToMaxVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}