package org.rosettacode;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cane
 */
public class SieveTest extends Assert {

    /**
     * See {@linktourl https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes}
     */
    private static final int[] PRIME_30 = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

    @Test
    public void test_sieve() {
        int[] primeNumbers = ArrayUtils.toPrimitive(Sieve.findPrimeNumbers(30).toArray(new Integer[0]));
        assertArrayEquals(PRIME_30, primeNumbers);
    }
}