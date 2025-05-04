package OOP.Abstractizare.Interfete;

import org.testng.annotations.Test;

public class OOPAbstractInterfataTest1 {

    @Test
    public void test() {

        Cerc formaCerc = new Cerc();
        formaCerc.setRaza(3);
        formaCerc.calculeazaArie();

        Patrat formaPatrat = new Patrat();
        formaPatrat.setLatura(6);
        formaPatrat.calculeazaArie();


    }
}
