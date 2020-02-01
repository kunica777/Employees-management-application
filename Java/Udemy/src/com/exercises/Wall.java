package com.exercises;

public class Wall {
    private double width;
    private double height;

    //constructor with no values
    public Wall(){}

    //constructor with two parameters
    public Wall(double width, double height){
        if(width<0){
            width=0;
        }else if(height<0){
            height=0;
        }
        this.width=width;
        this.height=height;
    }
    //getters
    public double getWidth() {
        if(width<0){
            width=0;
        }
        return width;
    }
    public double getHeight() {
        if(height<0){
            height=0;
        }
        return height;
    }
    //setters

    public void setWidth(double width) {
        if(width<0){
            width=0;
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if(height<0){
            height=0;
        }
        this.height = height;
    }
    public double getArea(){
     /* if(width<0 || height<0){
            width=0;
            height=0;}*/
        return width*height;
    }
}
