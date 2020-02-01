package com.exercises;

public class StringMethods {
    public static void main(String[] args) {
        concatenateTwoStrings("Java","Fundamentals");
        System.out.println("_______________________________________________");
        getLength("This is Java!");
        System.out.println("_______________________________________________");
        compareLexicographic("This is a comparison","THIS is A Comparison");
        System.out.println("_______________________________________________");
        checkStringEnding("Java exercises", "ses");
        System.out.println("_______________________________________________");
        countTypesOfCharacters("Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33");


    }

    //#1 - method removes first letter from both strings and concatenate them
    static void concatenateTwoStrings(String first, String second){
        String result = first.substring(1)+ second.substring(1);
        System.out.println("The first string is: "+ first);
        System.out.println("Th second string is: "+ second);
        System.out.println("The result of concatenation is: "+ result);
    }
    //#2 - method to get string length
    static void getLength(String string){
        System.out.println("The length of string "+ string + " is "+ string.length()); }

    //#3 - method checks if both strings are the same
    static void compareLexicographic(String first, String second){
        if(first.toLowerCase().equals(second.toLowerCase())){
            System.out.println(first + " equals to "+ second);
        }else{
            System.out.println(first + " not equal to "+ second);}}

    //#4 - method that checks if string end with another string
    static void checkStringEnding(String string, String ending){
        String first = string.toLowerCase();
        String second = ending.toLowerCase();
        int substringPoint = first.length()-second.length();
        if(first.substring(substringPoint).equals(second)){
            System.out.println(string + " ends with "+ ending);
        }else{
            System.out.println(string + " does not end with " + ending);}}

    //#5 count how many letter, numbers, spaces and other characters in a string
    static void countTypesOfCharacters(String string){
        int letters = 0;
        int numbers = 0;
        int spaces = 0;
        int other = 0;
        for(int i = 0; i<string.length(); i++){
            if(Character.isSpaceChar(string.charAt(i))){// if char is a space
                spaces++;}
            else if(Character.isDigit(string.charAt(i))){// if char is a digit
                numbers++;
            }else if(Character.isLetter(string.charAt(i))){// if char is a letter
                letters++;
            }else{// if char is everything else
                other++;}}
        System.out.println(string+ "\nconsists of "+ letters+ " letters, "+
                numbers+ " digits, "+ spaces+ " spaces and "+ other+ " other symbols");}
}
