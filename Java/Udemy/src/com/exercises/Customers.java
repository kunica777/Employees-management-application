package com.exercises;
import java.util.Scanner;

public class Customers {
    public static void main(String[] args) {
        ShopDemo shop = new ShopDemo(0.9,0.5,1.80,
                1.0,2.0, 5.2, 4.0, 2.6,
                1.3, 0.8, 0.95, 3.30);

    }

    public static void buyStuff(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("What would you like to buy? ");
            if(sc.nextLine()=="milk"){

            }
        }
    }
}
