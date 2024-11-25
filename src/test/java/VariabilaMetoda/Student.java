package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

//    class = sablon care defineste propr si comportamentul unei entitati specifice
//    Intr-un fisier java putem avea mai multe clase diferentiate  pe baza numelui ( nu e practice buns a avem mai multe clase cu acelais nume)
//   intr-o clasa putem defini toate proprietatile si actiunie unei entitati
//    varabila = proprietatea unei clase
//    variabilele sunt de 2 feluri : Globale si Locale
//    variabila globala = vizibile peste tot in proeict
//    variabila locala = vizibila doar unde e declarata
//    Ca sa definim o variablia globala ne trebuie: accescontrol(public) tip variablila nume variabila
//    metoda = actiunea unei clase
//    exsita 2 tipuri metode: void si return
//

    public String Nume;
//    In momentul cand definim o variabila nu este obligatoriu sa ii dam o valoare
    public String Prenume;
    public Integer Varsta;
    public String Adresa;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean AreDiploma;


    @Test
    public void prezentareStudent(){
        Nume = "Gligan";
        Prenume = "Paul";
        Varsta = 41;
        Adresa = "Cluj 1";
        Inaltime = 186.5;
        Greutate = 135.50f;
        Sex = 'M';
        AreDiploma = true;

//        System.out.print(Nume + " " + Prenume + " " + Varsta + " " + Adresa);
//        System.out.println(Inaltime);
        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenumele studentului este: " + Prenume);
        System.out.println("Varsta studentului este: " + Varsta);
        System.out.println("Adresa studentului este: " + Adresa);
        System.out.println("Inaltimea studentului este: " + Inaltime);
        System.out.println("Greutatea studentului este: " + Greutate);
        System.out.println("Sexul studentului este: " + Sex);
        System.out.println("Are studentul diploma? " + AreDiploma);
        calculMedie();

    }

    public void calculMedie(){
    Integer nota1 = 7;
    Integer nota2 = 8;
    Integer nota3 = 9;

    Integer medie = (nota1 + nota2 + nota3) / 3;

    System.out.println("Media studentului este: " + medie);

    }



}
