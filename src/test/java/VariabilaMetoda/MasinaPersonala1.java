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
    public void metodaTest(){
        masina1("dacia", "Logan",2017, 55000.0,"Albastru", true);
        masina1("toyota", "rav4",2017, 15000.0,"Albastru", false);
    }
    public void masina1(String param1, String param2, int param3, Double param4, String param5, Boolean param6){
        Marca = param1;
        Model = param2;
        AnFabricatie = param3;
        Km = param4;
        Culoare = param5;
        Asigurare = param6;

        System.out.println("Marca masinii este: " + Marca);
        System.out.println("Modelul masinii este: " + Model);
        System.out.println("Anul fabricatie este: " + AnFabricatie);
        System.out.println("Km masinii sunt: " + Km);
        System.out.println("Culoare masinii este: " + Culoare);
        System.out.println("Masina are asigurare? " + Asigurare);
        medieKmParcursiPerAn(param4);
//      medieKmParcursiPerAn(15000.0);
    }

    public void medieKmParcursiPerAn(Double kmTotali){
        Double medieKmParcursi = kmTotali/5;
        System.out.println("Media kilometrilor parcursi anual este : " + medieKmParcursi);
    }


}
