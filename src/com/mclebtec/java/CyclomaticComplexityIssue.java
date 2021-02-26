package com.mclebtec.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Here the complexity is high and there seems to be and increase in the code as and
 * when new input variables are provided
 */
public class CyclomaticComplexityIssue {

    public static void main(String[] args) {
        int a = 10, b = 11, c = 12;
        //Cyclomatic issues
        checkBiggestNumber(a, b, c);
        //Simple code
        printBiggestNumber(a, b, c);
    }

    private static void checkBiggestNumber(int a, int b, int c) {
        if (a > b)
            if (a > c)
                System.out.println("Biggest Number: " + a);
        if (b > a)
            if (b > c)
                System.out.println("Biggest Number: " + b);
        if (c > a)
            if (c > b)
                System.out.println("Biggest Number: " + c);
    }

    public static void printBiggestNumber(Integer... nums) {
        System.out.println(nums);
        List<Integer> numbers = Arrays.asList(nums);
        Comparable max = Collections.max(numbers);
        System.out.println(max + " is biggest KISS");
    }
}
