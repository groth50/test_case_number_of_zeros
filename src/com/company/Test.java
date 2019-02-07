package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Test class for FactorialZeros
 */
public class Test {
    public static void main(String[] args) {
        FactorialZeros factorialZeros = new FactorialZeros();
        System.out.println(factorialZeros.getNumberZeros(10012));
        System.out.println(checkNumberZeros(10012, factorialZeros.getNumberZeros(10012)));
    }

    /** Find number of zeros */
    private static boolean checkNumberZeros(int fac, int zeros) {
        String facString =  new Factorial(fac).getFactorial().toString();
        return getNumberZerosForString(facString) == zeros;
    }

    /** Find number of zeros for String */
    private static int getNumberZerosForString(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        Pattern p = Pattern.compile("^0+");
        Matcher m = p.matcher(reverse);
        m.lookingAt();
        return m.end();
    }
}
