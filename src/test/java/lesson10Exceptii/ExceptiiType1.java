package lesson10Exceptii;

import java.lang.reflect.Array;

public class ExceptiiType1 {

    // exceptiile reprezinta situatii care apar in timpul executiei unui program care determina oprirea acestuia
    // ofera un mecanism efecient de identificare si rezolvare a erorilor
    // Sunt modelate sub forma de calse: Error, Exception, Runtime Exception, Personalizate
    // Sunt jectionate folosing "Try, catch, finally"
    // 2 tipuri mari de exceptii: chekced/unchekced.
    // Erorile Checked sunt exceptii de compilare si naume nu poti face build munui proiect fara rezolvarea exceptiei(SQL, IO si ClassNotFound)
    // Erorile Uncheked - sunt exceptii de runtime care sunt ignorate in timpul compilarii dar sunt aruncate in timpul execuiei prg (NullPointer, ArrayIndexOutOfBound, Arithmetic )
    // Cuvinte cheie : Throw (exceptie in mo explicit de o methoda sau code block) si Throws (se fol odata cu metoda care poate arunaca 1 sau mai multe tipuri de exceptii)

    public static void main(String[] args) throws ExceptiiCustom {


//        try {
//            System.out.println(12/0);
//        } catch (ArithmeticException e) {
//            System.out.println("Eroare aritmetica este: " + e.getMessage());
//        }

        try {
            int[] numbers = new int[10];
            numbers[11] = 4;
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println(e.getMessage());
            throw new ExceptiiCustom("Exceptie definita custom");
        } finally {
            System.out.println("Acest mesaj se executa indiferent daca exceptia e prinsa deja");
        }

    }

}
