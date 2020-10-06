package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    AreaCalc areaCalc = new AreaCalc();

        System.out.println("Enter the radius of your circle: ");
        double circleRad = scanner.nextDouble();

        System.out.println("Enter the length and width of your square or rectangle: ");
        double squareX = scanner.nextDouble();
        double squareY = scanner.nextDouble();

	    areaCalc.area(circleRad);
        areaCalc.area(squareX,squareY);
    }
}
