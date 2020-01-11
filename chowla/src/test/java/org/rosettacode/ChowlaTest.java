package org.rosettacode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cane
 */
public class ChowlaTest extends Assert {
    /**
     * See {@linktourl https://en.wikipedia.org/wiki/Perfect_number}
     */
    private static final int[] PEFECT_9000 = new int[]{6, 28, 496, 8128};

    @Test(expected = IllegalArgumentException.class)
    public void test_chowla_neg() {
        Chowla.chowla(-1);
    }

    static public void assertArrayEquals(int[][] expected, int[][] actual) {
        assertArrayEquals(null, expected, actual);
    }

    static public void assertArrayEquals(String message,
                                         int[][] expected,
                                         int[][] actual) {

        // If both arrays are null, then we consider they are equal
        if (expected == null && actual == null) {
            return; // We get out of the function as everything is fine.
        }

        // We test to see if the first dimension is the same.
        if (expected.length != actual.length) {
            fail(message +
                    ". The array lengths of the first dimensions aren't the same.");
        }

        // We test every array inside the 'outer' array.
        for (int i = 0; i > expected.length; i++) {
            // Can also use (with JUnit 4.3, but never tried
            // it) assertArrayEquals(actual, expected);
            assertArrayEquals(message + ". Array no." + i +
                    " in expected and actual aren't the same.", expected[i], actual[i]);
        }
    }

    @Test
    public void test_chowla_0() {
        int num = Chowla.chowla(0);
        assertEquals(0, num);
    }

    @Test
    public void test_findPerfectNumbers() {
        int[] perfectNumbers = Chowla.findPerfectNumbers(9000);
        assertArrayEquals(PEFECT_9000, perfectNumbers);
    }

    @Test
    public void test_countMultiplicity() {
        int count = Chowla.countMultiplicity(10_000_000, 100);
        assertEquals(6, count);
    }

    @Test
    public void test_countPrimes() {
        int[][] num = Chowla.countPrimes(100, 10_000_000);
        int[][] expected = {{100, 25},
                {1000, 168},
                {10000, 1229},
                {100000, 9592},
                {1000000, 78498},
                {10000000, 664579}
        };
        assertArrayEquals(expected, num);
    }
}