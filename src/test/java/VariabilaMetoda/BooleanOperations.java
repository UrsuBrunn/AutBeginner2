package VariabilaMetoda;

import org.testng.annotations.Test;

public class BooleanOperations {

    public Boolean primaOperatie;
    public Boolean isSunny;;
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
        goOut();




    }
    public void greaterValue1(){
        Integer value1 = 10;
        Integer value2 = 20;
        Boolean greater = value1 > value2;

        System.out.println("Is value 1 greater then value 2? " + greater);

    }
    public void goOut(){
        Boolean shouldGoOut = isSunny || isWarm != chanceOfRain;
        Boolean shouldNotGoOut1 = isSunny || isWarm && chanceOfRain;
        Boolean shouldNotGoOut2 = isSunny.true && chanceOfRain;
        Boolean shouldNotGoOut3 = isWarm && chanceOfRain;

        System.out.println("Should I go out on this weather? " + shouldGoOut);
        System.out.println("Should I go out on this weather? " + shouldNotGoOut1);
        System.out.println("Should I go out on this weather? " + shouldNotGoOut2);
    }

}
