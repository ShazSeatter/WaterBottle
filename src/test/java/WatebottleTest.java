import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WatebottleTest {

    Waterbottle waterbottle;

    @Before
    public void setup() {
        waterbottle = new Waterbottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void hasVolumeDecreasedBy10() {
        assertEquals(90, waterbottle.drinkWater());
    }

    @Test
    public void emptyBottle() {
        assertEquals(0, waterbottle.empty());
    }

    @Test
    public void volumeBackTo100() {
        assertEquals(100, waterbottle.fill());
    }
}
