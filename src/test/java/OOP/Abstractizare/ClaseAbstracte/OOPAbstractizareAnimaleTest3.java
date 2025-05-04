package OOP.Abstractizare.ClaseAbstracte;

import org.testng.annotations.Test;

public class OOPAbstractizareAnimaleTest3 {

    @Test
    public void test() {

    Pasari pasari = new Pasari();
    pasari.setPicioare(2);
    pasari.setAripi(2);
    pasari.caracteristici();

    Feline feline = new Feline();
    feline.setPicioare(4);
    feline.caracteristici();

    Primate primate = new Primate();
    primate.setPicioare(2);
    primate.setMaini(2);
    primate.caracteristici();

    }
}
