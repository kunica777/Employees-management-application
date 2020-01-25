package com.company;
public class Sum {
    public static void main(String[]args){
    int nums [] = new int []{1,2,3,4,5,6,7,8,9,10};
    System.out.println("The sum of even numbers is: "+ getSumOfEven(nums));
    System.out.println("The sum of odd numbers is: "+ getSumOfOdd(nums));
    System.out.println("The sum of even indexes numbers is: "+ getSumOfEvenIndexes(nums));
    System.out.println("The sum of odd indexes numbers is: "+ getSumOfOddIndexes(nums));
}
    static int getSumOfEven(int [] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            if (array[i]%2==0){
                sum+=array[i];
            }
        }return sum; }
    static int getSumOfOdd(int [] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            if (array[i]%2!=0){
                sum+=array[i]; }
        }return sum;
    }
    static int getSumOfEvenIndexes(int [] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            if (i%2==0){
                sum+=array[i]; }
        }return sum;
    }
    static int getSumOfOddIndexes(int [] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            if (i%2!=0){
                sum+=array[i]; }
        }return sum;
    }
}
