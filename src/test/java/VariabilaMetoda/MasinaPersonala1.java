package VariabilaMetoda;

import org.testng.annotations.Test;


public class MasinaPersonala1 {

    public String Marca;
    public String Model;
    public Integer AnFabricatie;
    public Double Km;
    public String Culoare;
    public Boolean Asigurare;

    @Test
    public void masina1(){
        Marca = "Dacia";
        Model = "Logan MCV";
        AnFabricatie = 2017;
        Km = 71280.5;
        Culoare = "Albastru";
        Asigurare = true;

        System.out.println("Marca masinii este: " + Marca);
        System.out.println("Modelul masinii este: " + Model);
        System.out.println("Anul fabricatie este: " + AnFabricatie);
        System.out.println("Km masinii sunt: " + Km);
        System.out.println("Culoare masinii este: " + Culoare);
        System.out.println("Masina are asigurare? " + Asigurare);
        medieKmParcursiPerAn();
    }


    public void medieKmParcursiPerAn(){
        Double kmTotali = 71280.0;
        Double medieKmParcursi = kmTotali/5;
        System.out.println("Media kilometrilor parcursi anual este : " + medieKmParcursi);
    }


}
