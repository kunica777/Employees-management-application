package com.company.booleans;

public class AllCaps {
    public static void main(String[] args) {
        System.out.println(allCaps("Hello"));
        System.out.println(allCaps("HELLO"));
        System.out.println(allCaps("hello"));
    }

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
}
