package org.rosettacode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cane
 */
public class ChowlaTest extends Assert {

    @Test(expected = IllegalArgumentException.class)
    public void test_chowla_neg() {
        Chowla.chowla(-1);
    }

    @Test
    public void test_chowla_0() {
        int num = Chowla.chowla(0);
        assertEquals(0, num);
    }
}