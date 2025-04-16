package ObiectCobstructor;

import org.testng.annotations.Test;

public class AvionTest {

    @Test
    public void metodaTest() {
        Avion avion1 = new Avion("pasageri", "Boeing", "B-127", 260, "Kerosen");
        avion1.prezentareAvion();

        Avion avion2 = new Avion("pasageri", "Boeing", "B-180", 260, "Electric");
        avion2.prezentareAvion();

        Avion avion3 = new Avion("pasageri", "Boeing", "B-127", 260, "Electric", 300);
        avion3.prezentareAvion();


    }
}
