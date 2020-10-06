package com.company;

public class AreaCalc {

    public double area(double radius){
        if(radius < 0){
            return -1;
        }
        double rad = radius * radius * Math.PI;
        System.out.println("The Area of the circle is " + rad);
        return rad;
    }

    public double area(double x, double y){
        if(x < 0 || y < 0){
            System.out.println("you have entered a negative number.");
            return -1;
        }
        double squareArea = x * y;
        System.out.println("The area is " + squareArea);
        return squareArea;
    }

}
