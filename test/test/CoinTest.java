package test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Beckett
 */
public class CoinTest {

    public CoinTest() {
    }

    int denom[] = {25, 12, 5, 1};
    /*
    @Test
    void emptyArray() {
        int empty[] = {};
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            Coin.minChange(empty, 0);
        });
        assertEquals("Empty denomination array not allowed.", e.getMessage());
    }
    */
    @Test
    public void zero() {
        int[] expect = {0};
        assertArrayEquals(expect, Coin.minChange(denom, 0));
    }

    @Test
    public void eleven() {
        int[] expect = {5, 5, 1};
        assertArrayEquals(expect, Coin.minChange(denom, 11));
    }

    @Test
    public void twelve() {
        int[] expect = {12};
        assertArrayEquals(expect, Coin.minChange(denom, 12));
    }

    @Test
    public void fifteen() {
        int[] expect = {5, 5, 5};
        assertArrayEquals(expect, Coin.minChange(denom, 15));
    }

    @Test
    public void seventeen() {
        int[] expect = {12, 5};
        assertArrayEquals(expect, Coin.minChange(denom, 17));
    }

    @Test
    public void thirty() {
        int[] expect = {25, 5};
        assertArrayEquals(expect, Coin.minChange(denom, 30));
    }

    @Test
    public void thirtySix() {
        int[] expect = {12, 12, 12};
        assertArrayEquals(expect, Coin.minChange(denom, 36));
    }
}
