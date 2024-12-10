package VariabilaMetoda;

import org.testng.annotations.Test;

public class booleanoperations {

    public Boolean primaOperatie;
    public Boolean isSunny;
    public Boolean isWarm;
    public Boolean chanceOfRain;

    @Test
    public void booleanExercises(){

        primaOperatie = true;
        isSunny = true;
        isWarm = true;
        chanceOfRain = true;
        System.out.println("Este aceasta prima operatie?" + primaOperatie);
        greaterValue1();

    }
    public void greaterValue1(){
        Integer value1 = 10;
        Integer value2 = 20;
        Boolean greater = value1 > value2;

        System.out.println("Is value 1 greater then value 2? " + greater);

    }

}
