package OOP.Abstractizare.Interfete;

public interface FormeGeometrice {

    //toate metodele declarate sun abstracte by default
    void calculeazaArie();

    // public static final String culoare  = "verde" -> permite doar constante , nu si fielduri sau proprietati care nu sunt initializate
    String culoare = "Albastra";

    void deseneaza();

}
