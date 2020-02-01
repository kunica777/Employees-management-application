package com.exercises;
import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person =new Person ();
        System.out.print("please enter you first name: ");
        person.setFirstName(sc.nextLine());
        System.out.print("Please enter your last name: ");
        person.setLastName(sc.nextLine());
        System.out.print("Please enter your age: ");
        person.setAge(sc.nextInt());
        System.out.println("Your full name is: "+person.getFullName());
        System.out.println("Lets find out if you are a teen: "+ person.isTeen());
    }
}
