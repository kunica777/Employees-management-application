package com.company;

public class StringsApp {
    public static void main(String[] args) {
        //String name = "alice";
        String names[] = new String []{"AliCe", "aLicE", "alice", null, ""};
        for(String name: names){
            System.out.println(capitalize(name));
        }
        //capitalize(name);

    }//end of main method

    static String capitalize(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        }

        String lowerCase = word.toLowerCase();
        String upperCase = word.toUpperCase();
        String result = upperCase.charAt(0) + lowerCase.substring(1, word.length());
        return result;
    }
}

