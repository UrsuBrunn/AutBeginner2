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

    // POLYMORPHISM =  procesul pri care definim mai multe implementari pt o metoda
    // Polimorphism de 2 feluri: DDINAMIC(Override) si STATIC(Overload)
    // Polimorphism dinamic = intr-o ierarhie de clase obtinuta prin mostenire poate aea implementari diferite
    // Polimorphism static = posibilitatea prin care o metoda are mai multe implementari prin diferentierea numarului si tipului de parametrii


    // ABSTRACTIZARE = Reducerea unui element complex la un element mai simplu (reducerea completa a implementarii metodelor, lasand doar numele fucntiilor, parametrii si tipul returnat
    // Tipuri abstractizare: INTERFETE, Clase abstracte
    // Clasele abstracte sunt utilizate pentru a declara caracteristici comune unor subclase
    //      O clasa abstracta nu poate fi instantiata. Ea poate fi utiliza ca si super clasa pentru alte clase care detin clasa abstracta (clasa abstracta e definita folosind modificatorul ABSTRACT)
    //      O clasa abstracta poate contine atribute si metode pe langa clasa abstracta

    // Interfata = Ofera raspuns lipsei mosteniri multiple. Creaza un protocol pe care clasele trebuie sa il implementeze
    //          Interfata contine toate metodele abstracte ( e o clasa pur abstracta)

    // Modificatori de Access: PUBLIC, PRIVATE, PROTECTED and DEFAULT
    //      PUBLIC: codul e accesibil de oriunde si de orice clasa
    //      PRIVATE: codul e accesibil doar de clasa unde s-a scris codul
    //      PROTECTED: codul e accesibil doar din pachetul in care s-a scris codul, dar si de catre subclase (OOP mostenia)
    //      DEFAULT: codul se poate accesa doar din apchetul in care s-a scris codul. Intra in default daca nu se specifica un anume modificator de access




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

    // DEfinim prima impleentare pt o metoda (polimorphism dinamic)
    public void mananca() {
        System.out.println("Persoana mananaca cand ii este foame ");
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
