package OOP.Abstractizare.ClaseAbstracte;

import org.testng.annotations.Test;

public class OOPAbstractizareTest2 {

    @Test
    public void test() {

    Cerc formaCerc = new Cerc();
    formaCerc.setRaza(5);
    formaCerc.caclculArie();

    Patrat formaPatrat = new Patrat();
    formaPatrat.setLatura(10);
    formaPatrat.caclculArie();


    }
}
