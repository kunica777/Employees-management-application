package com.company;

import java.util.Arrays;

public class StringsApp {
    public static void main(String[] args) {
        String names[] = new String[]{"AliCe", "aLicE", "alice", null, ""};
        System.out.println(Arrays.toString(getValidArray(names)));
    }//end of main method

    //this method return an array of valid values (not null, not empty)
    static String[] getValidArray(String[] array) {
        //step 1: check how many values are valid
        int length = 0;
        for (String value : array) {
            if (!(value == null || value.isEmpty())) {
                length++;
            }
        }//step 2: create an array of the specified length
        String[] validValues = new String[length];

        //step 3: import valid values into a created array
        int index = 0;
        while (index < length) {
            for (String value : array) {
                if (!(value == null || value.isEmpty())) {
                    validValues[index] = value;
                }
                index++;
            }
        }
        return validValues;
    }
}//end of class

