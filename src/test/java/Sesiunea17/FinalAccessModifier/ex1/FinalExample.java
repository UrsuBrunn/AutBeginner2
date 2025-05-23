package Sesiunea17.FinalAccessModifier.ex1;

public class FinalExample {
    // keyword = FINAL:
    //      - poate fi aplicat pentru clasa exterioara, variabile, fields si metode
    //      -  nu poate fi aplicata la interfete, constructor, blocks si enums
    //
    //      - O clasa nu poate fi extinsa, mostenita
    //      -  final metohod nu poate fi suprascrisa
    //      - O variabila declarata si initializata ca si FINAL, nu poate fi schimbata
    //      -


    static int a=123;
    static final int ROTI_MASINA=4;

    public static void main(String[] args) {
        System.out.println("a=: " + a);
        a=a+1;
        a++;
    }
}
