package VariabilaMetoda;

import org.testng.annotations.Test;

public class IntegerOperations {
    public Integer Latura1;
    public Integer Latura2;
    public Integer Minute;
    public Integer LaturaPatrat;

    @Test
    public void conversie(){

        Latura1 = 5;
        Latura2 = 8;
        Minute = 15;
        LaturaPatrat = 10;

           Integer perimeterRectangle = (Latura1 + Latura2) * 2;
           Integer minutesToSeconds = Minute * 60;
           Integer areaSquare = LaturaPatrat * LaturaPatrat;

        System.out.println("The perimeter of the rectangle is: " + perimeterRectangle);
        System.out.println("The minutes conversion to seconds is : " + minutesToSeconds);
        System.out.println("The area of the rectangle is: " + areaSquare);

    }
}
