package com.exercises;

public class integerArrays {
    public static void main(String[] args) {
        int nums [] = {1,2,3,6,8,9,5,-4,0};
        getNumbers(nums,5);

    }
    public static void getNumbers(int[] array, int number){
        //find numbers that sum up the given number
        String result= "";
        for(int digit: array){
            for(int i=1; i<array.length; i++){
                if(digit+array[i]==number){
                    result+=digit + " + " + array[i]+ "; ";
                }
            }
        }
        System.out.println("Numbers are: "+ result);
    }
}
