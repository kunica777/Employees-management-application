package com.company.booleans;

public class ShortCircuit {
    public static void main(String[] args) {
        bothTrue(true,false);
        bothTrue(true,true);
        bothTrue(false,false);

    }//end of main
    public static void bothTrue(boolean first, boolean second){
        if(first && second){
            System.out.println("both are true");}
        else if(!(first && second)){
            System.out.println("Both are false");
        }else if(!first){
            System.out.println("first is false");
        }else{
            System.out.println("second is false"); }}
}//end of class
