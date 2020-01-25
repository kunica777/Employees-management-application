package com.company.booleans;

public class AllCaps {
    public static void main(String[] args) {
        //System.out.println(allCaps("Hello"));
        //System.out.println(allCaps("HELLO"));
        //System.out.println(allCaps("hello"));
        System.out.println(hasAllNumbers("1234567"));
        System.out.println(hasAllNumbers("abc123"));
        System.out.println(hasAllNumbers("hello"));
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


    static boolean hasAllNumbers(String input){
        int index=0;
        int numbers =0;
        while(index<input.length()){
            if(Character.isDigit(input.charAt(index))){
                numbers++;
            }index++;
        }return numbers == input.length();
    }


}
