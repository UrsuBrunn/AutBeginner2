package OOP;

public class Persoana {
    // OOP = Programare orientata obiect
    //4 principii: mostenire / incapsulare / polymophism si abstractizare
    // MOSTENIRE - cconceptul prin care o clasa (copil) mosteneste o alta clasa (parinte)
    //      - In JAVA putem mosteni o singura clasa
    //      - In momentul in care o clasa mosteneste o alta clasa, clasa copil trebe sa apeleze constructorul din parinte
    //      - In momentul in care sa aplica mostenirea, copilul are vizibilitate asupra variabilelor / metodelor din aprinte
    //      -  constructorul din parinte in copil se apeleaza cu "SUPER"
    public String nume;
    public String prenume;
    public Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPerosana() {
        System.out.println("Numele este " + nume);
        System.out.println("Prenume este " + prenume);
        System.out.println("Varsta este " + varsta);
    }



}
