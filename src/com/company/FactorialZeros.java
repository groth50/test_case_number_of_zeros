package com.company;

/**
 * Finds the number of zeros at the end
 * of factorial of a positive number.
 */
public class FactorialZeros {
    private final static int FIVE = 5;

    /** Finds the number of zeros */
    public int getNumberZeros(int num) {
        // special case
        if (num < 0) {
            throw new IllegalArgumentException("Please, input positive number.");
        }
        // special case
        if (num < 5) {
            return 0;
        }
        int result = 0;
        int degreeOfFive = FIVE;
        while ((num / degreeOfFive) != 0) {
            result = result + num / degreeOfFive;
            degreeOfFive *= FIVE;
        }
        return result;
    }
}
