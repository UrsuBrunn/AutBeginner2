package com.example.autbeginner2;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutBeginner2Application {

    public static void main(String[] args) {
        SpringApplication.run(AutBeginner2Application.class, args);
        citireNote();
//        printareValori();
//        printareValoriDoWhile();
    }

    public static void citireNote(){
        System.out.println("Introduceti o nota");
        Scanner scannerNote = new Scanner(System.in);
        int nota = scannerNote.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota "+ nota +" Invalida pentru ca nu e intre 1 si 10");
            nota = scannerNote.nextInt();
        }
        System.out.println("Nota "+ nota +" este valida intre 1 si 10");
    }

    public static void printareValori(){
        System.out.println("Introduceti o valoare");
                int valoarenou = 1;
        while (valoarenou <= 5) {
            System.out.println("Valoare "+ valoarenou +" e mai mica ca 5");
            valoarenou++;
        }
    }

    public static void printareValoriDoWhile(){
        System.out.println("Introduceti o valoare");
        int valoarenou = 1;
        do{
            System.out.println("Valoare "+ valoarenou +" e mai mica ca 5");
            valoarenou++;
        } while (valoarenou <= 5);
    }

}
