package OOP;

import org.testng.annotations.Test;

public class OOPTest1 {

    @Test
    public void test() {
        Student Paul = new Student("Gligan","Paul",42,"UTCN",3,Boolean.FALSE);
        Paul.infoStudent();

        Angajat Paul2 = new Angajat("Gligan","Paul",42,"Endava", 15, 25);
        Paul2.infoAngajat();

        Paul2.promovare();


    }
}
