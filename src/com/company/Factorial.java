package com.company;

import java.math.BigInteger;

/**
 * Class represents factorial of integer number
 * from 0 to 2 147 483 647.
 */
public class Factorial {
    private BigInteger factorial;

    public Factorial(int fact) {
        this.factorial = factorial(fact);
    }

    public BigInteger getFactorial() {
        return factorial;
    }

    // factorial calculations
    private BigInteger factorial(int fact) {
        // special case
        if (fact < 0) {
            throw new IllegalArgumentException();
        }
        // special case 0! = 1;
        if (fact == 0) {
            return new BigInteger("1");
        }
        BigInteger result = new BigInteger("1");
        long i = 1;
        while (i <= fact) {
            result = result.multiply(new BigInteger("" + i));
            i++;
        }
        return result;
    }
}
