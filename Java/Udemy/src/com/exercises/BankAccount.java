package com.exercises;

public class BankAccount {
    //field instances
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    //getters of private instances
    public long getAccountNumber(){
        return accountNumber;}
    public double getBalance(){
        return balance;}
    public String getCustomerName(){
        return customerName;}
    public String getEmail(){
        return email;}
    public long getPhoneNumber(){
        return phoneNumber;}

    //setters of field instances
    public void setAccountNumber(long account){
        this.accountNumber = account;}
    public void setBalance(double balance){
        this.balance=balance;}
    public void setCustomerName(String customerName){
        this.customerName=customerName;}
    public void setEmail(String email){
        this.email=email;}
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;}

    //deposit method
    public double depositFunds(double amount){
        if(amount<=0){
            System.out.println("Invalid input");
            amount=0;
        }
        System.out.print("Your balance is: ");
        return balance+=amount;}
    public double withdrawFunds(double amount){
        if(amount>=0 && balance-amount>=0){
            balance-=amount;
            System.out.print("Your balance is: ");
        }else{
            System.out.print("Insufficient balance. Operation failed. Your balance is: ");
        }
        return balance;}
    }
