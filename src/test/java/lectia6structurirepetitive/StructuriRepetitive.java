package lectia6structurirepetitive;

import java.util.Scanner;
import org.testng.annotations.Test;


public class StructuriRepetitive {

    @Test
    public void evaluareStructuriRepetitive() {
        citireNote();

    }
    @Test
    public void citireNote(){
        System.out.println("Introduceti o nota: ");
        Scanner scannerNote = new Scanner(System.in);
        int nota = scannerNote.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota "+nota+" Invalida pentru ca nu e intre 1 si 10");
            nota = scannerNote.nextInt();
        }
        System.out.println("Nota "+nota+" este valida intre 1 si 10");

    }


}
