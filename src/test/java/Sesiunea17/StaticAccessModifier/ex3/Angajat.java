package Sesiunea17.StaticAccessModifier.ex3;

public class Angajat {
    static int numarAnagajat = 0;
    public void numarAngajat() {
        numarAnagajat=numarAnagajat+1;
        System.out.println("Numar angajati: " + numarAnagajat);

    }
}
