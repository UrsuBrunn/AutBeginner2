package OOP;

public class Persoana {
    // OOP = Programare orientata obiect
    //4 principii: mostenire / incapsulare / polymophism si abstractizare
    // MOSTENIRE - cconceptul prin care o clasa (copil) mosteneste o alta clasa (parinte)
    //      - In JAVA putem mosteni o singura clasa
    //      - In momentul in care o clasa mosteneste o alta clasa, clasa copil trebe sa apeleze constructorul din parinte
    //      - In momentul in care sa aplica mostenirea, copilul are vizibilitate asupra variabilelor / metodelor din aprinte
    //      -  constructorul din parinte in copil se apeleaza cu "SUPER"


    // INCAPSULARE =  procesul prin care tinem departe anumite informatii ca elee  sa nu poata fi modificate
    // facem avriabilele / metode din PUBLIC in PRIVATE
    // PRIVATE = access control care restrictioneaza accessul doar in clasa respectiva
    // Ca sa extragem  sau modificam o valaore a unei variabile private ne folosim de metode GET si SET


    private String nume;
    private String prenume;
    private Integer varsta;

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

    public Integer getVarsta() {
        return varsta;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
