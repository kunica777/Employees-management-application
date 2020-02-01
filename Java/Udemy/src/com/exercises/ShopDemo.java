package com.exercises;

public class ShopDemo {

    private double milk;
    private double bread;
    private double eggs;
    private double water;
    private double beer;
    private double wine;
    private double salami;
    private double cheese;
    private double butter;
    private double apples;
    private double bananas;
    private double grapes;

    public ShopDemo(double milk,   double bread,   double eggs,
                    double water,  double beer,    double wine,
                    double salami, double cheese,  double butter,
                    double apples, double bananas, double grapes) {
        this.milk = milk;
        this.bread = bread;
        this.eggs = eggs;
        this.water = water;
        this.beer = beer;
        this.wine = wine;
        this.salami = salami;
        this.cheese = cheese;
        this.butter = butter;
        this.apples = apples;
        this.bananas = bananas;
        this.grapes = grapes;
    }

    public double getMilk() {
        return milk;
    }

    public double getBread() {
        return bread;
    }

    public double getEggs() {
        return eggs;
    }

    public double getWater() {
        return water;
    }

    public double getBeer() {
        return beer;
    }

    public double getWine() {
        return wine;
    }

    public double getSalami() {
        return salami;
    }

    public double getCheese() {
        return cheese;
    }

    public double getButter() {
        return butter;
    }

    public double getApples() {
        return apples;
    }

    public double getBananas() {
        return bananas;
    }

    public double getGrapes() {
        return grapes;

    }

    public String verifyAge(int age){
        if(age<18){
            return "teen";
        }else if(age>=18 && age<21){
            return "youth";
        }else{
            return "adult";
        }
    }public void sellAlcohol(String age){
        if(age.equals("teen")){
            System.out.println("Sorry no alcohol for you.");
        }else if(age.equals("youth")){
            System.out.println("You may have 1 beer.");
        }else if(age.equals("adult")){
            System.out.println("You may buy beer and wine.");
        }
    }
}
