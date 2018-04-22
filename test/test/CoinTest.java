package test;

import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Authors: Bailey Kouwenhoven and J. Beckett Sweeney
 * Date: 21 Apr 2018
 * Overview: This program uses dynamic programming to provide the least amount of
 * 		for a requested amount with any set of denominations.
 * Special Instructions: 
 *      - The denomination system used must be consistent for each
 * 		test for the dynamic programming array to also be consistent.
 *      - To run on NetBeans, press alt+f6 to "Test Project" instead of 
 *              "Run Project."
 */
public class CoinTest {

    public CoinTest() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyArray() {
        int empty[] = {};
        int[] expect = {0};
        assertArrayEquals(expect, Coin.minChange(empty, 0));
    }

    @Test
    public void zero() {
        int denom[] = {1};
        int[] expect = {0};
        assertArrayEquals(expect, Coin.minChange(denom, 0));
    }

    @Test
    public void fifteen() {
        int denom[] = {25, 12, 5, 1};
        int[] expect = {5, 5, 5};
        assertArrayEquals(expect, Coin.minChange(denom, 15));
    }

    @Test
    public void seventeen() {
        int denom[] = {25, 12, 5, 1};
        int[] expect = {12, 5};
        assertArrayEquals(expect, Coin.minChange(denom, 17));
    }

    @Test
    public void thirtySix() {
        int denom[] = {25, 12, 5, 1};
        int[] expect = {12, 12, 12};
        assertArrayEquals(expect, Coin.minChange(denom, 36));
    }

    @Test
    public void nine() {
        int denom[] = {10, 5, 3, 1};
        int[] expect = {3, 3, 3};
        assertArrayEquals(expect, Coin.minChange(denom, 9));
    }
}
