package OOP;

import org.testng.annotations.Test;

public class OOPTest1 {

    @Test
    public void test() {
        Student Paul = new Student("Gligan","Paul",42,"UTCN",3,Boolean.FALSE);
//        Paul.infoStudent();
//        Paul.mananca();

        Angajat Paul2 = new Angajat("Gligan","Paul",42,"Endava", 15, 25);
        Paul2.infoAngajat();
        Paul2.marire();
        Paul2.marire(10);
        Paul2.marire("Lead");
        System.out.println();
//        Paul2.promovare();
//        Paul2.mananca();


    }
}
