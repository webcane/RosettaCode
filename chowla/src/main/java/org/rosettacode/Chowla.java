package org.rosettacode;

import java.util.Locale;

/**
 * Created by cane
 */
public class Chowla {

    public static void main(String[] args) {
        // task 1
        int limit = 37;
        for (int i = 1; i <= limit; i++) {
            System.out.printf("chowla(%d) = %d%n", i, chowla(i));
        }
        System.out.println();

        // task 2
        int n, count = 0, power = 100;
        limit = 10000000;
        for (n = 2; n <= limit; n++) {
            if (chowla(n) == 0) count++;
            if (n % power == 0) {
                System.out.printf(Locale.US, "There is %,d primes up to %,d%n", count, power);
                power *= 10;
            }
        }
        System.out.println();

        // task 3
        count = 0;
        limit = 35000000;
        int k = 2, kk = 3, p;
        while ((p = k * kk) < limit) {
            if (chowla(p) == p - 1) {
                System.out.printf("%d is a perfect number%n", p);
                count++;
            }
            k = kk + 1;
            kk += k;
        }
        System.out.printf(Locale.US, "There are %d perfect numbers < %,d%n", count, limit);
    }

    public static int chowla(int n) {
        if (n < 0) throw new IllegalArgumentException("n is not positive");
        int sum = 0;
        for (int i = 2, j; i * i <= n; i++)
            if (n % i == 0) sum += i + (i == (j = n / i) ? 0 : j);
        return sum;
    }
}
