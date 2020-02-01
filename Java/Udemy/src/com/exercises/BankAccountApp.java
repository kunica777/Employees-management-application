package com.exercises;
import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner sc = new Scanner(System.in);
        boolean exit=false;
        System.out.print("Please enter account number: ");
        bankAccount.setAccountNumber(sc.nextLong());
        System.out.print("Please enter balance: ");
        bankAccount.setBalance(sc.nextDouble());
        System.out.print("Please enter customer name: ");
        bankAccount.setCustomerName(sc.next());
        System.out.print("Please enter customer email address: ");
        bankAccount.setEmail(sc.next());

        System.out.print("Please enter customer's phone number: ");
        bankAccount.setPhoneNumber(sc.nextLong());
        System.out.println("Account was created successfully.");
        while(!exit){
        System.out.println("Press 1 to deposit funds");
        System.out.println("Press 2 to withdraw funds");
        System.out.println("Press 3 to exit");
        switch(sc.nextInt()){
            case 1:
                System.out.print("Enter amount to deposit: ");
                System.out.println(bankAccount.depositFunds(sc.nextDouble()));
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                System.out.println(bankAccount.withdrawFunds(sc.nextDouble()));
                break;
            case 3:
                System.out.println("Goodbye");
                exit=true;
                break;
            default:
                System.out.println("Invalid input");
                break;
        }}}
}
