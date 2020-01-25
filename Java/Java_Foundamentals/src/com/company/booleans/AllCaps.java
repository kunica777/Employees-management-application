package com.company.booleans;

import java.util.concurrent.TimeUnit;

public class AllCaps {
    public static void main(String[] args) {
        System.out.println(hasAtListOneNumber("1234567"));
        System.out.println(hasAtListOneNumber("abc123"));
        System.out.println(hasAtListOneNumber("hello"));
    }//end of main

    static boolean allCaps(String word) {
        int index = 0;
        int upperCases = 0;
        while (index < word.length()) {
            if (Character.isUpperCase(word.charAt(index))) {
                upperCases++;
            }
            index++;
        }
        return upperCases == word.length();
    }

    static boolean hasAllNumbers(String input) {
        int index = 0;
        int numbers = 0;
        while (index < input.length()) {
            if (Character.isDigit(input.charAt(index))) {
                numbers++;
            }
            index++;
        }
        return numbers == input.length();
    }

    static boolean hasAtListOneNumber(String input) {
        int index = 0;
        while (index < input.length()) {
            if (Character.isDigit(input.charAt(index))) {
                return true;
            }
            index++;
        }
        return false;
    }
}//end of class
