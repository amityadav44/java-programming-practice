package kgcodingChallange77.kgcoding.util;

import kgcodingChallange77.kgcoding.geometry.Circle;
import kgcodingChallange77.kgcoding.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10, 5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.length * rect.breadth;

        System.out.printf("Area of circle is: %.2f, Area of rectangle is: %.2f%n", cirArea, rectArea);
    }
}
