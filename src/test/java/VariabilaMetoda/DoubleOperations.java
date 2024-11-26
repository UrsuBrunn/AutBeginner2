package VariabilaMetoda;

import org.testng.annotations.Test;

public class DoubleOperations {
    public Double heightCylinder;
    public Double radiusCylinder;
    public Double farenheitTemp;
    public Double rightTriangleShortSide1;
    public Double rightTriangleShortSide2;

    @Test
    public void doubleTypeOperations() {

        heightCylinder = 25.0;
        radiusCylinder = 5.0;
        farenheitTemp = 45.0;
        rightTriangleShortSide1 = 5.0;
        rightTriangleShortSide2 = 9.0;


        Double areaCylinder = heightCylinder * radiusCylinder * Math.PI;
        Double farenheitToCelsius = (farenheitTemp - 32) / 1.8;
        Double rightAngleHypotenuse = Math.sqrt(Math.pow(rightTriangleShortSide1,2) + Math.pow(rightTriangleShortSide2,2));

        System.out.println("Aria of an cylinder is : " + areaCylinder);
        System.out.println("Conversion of temperature from Farenheit to Celsius is: " + farenheitToCelsius);
        System.out.println("Length of a right angled triangle Hypotenuse is: " + rightAngleHypotenuse);
    }
}
