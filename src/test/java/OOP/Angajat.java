package OOP;

public class Angajat extends Persoana{

    private String firma;
    private Integer experienta;
    private Integer zileConcediu;

    public Angajat(String nume, String prenume, Integer varsta,String firma,Integer experienta,Integer zileConcediu) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experienta = experienta;
        this.zileConcediu = zileConcediu;
    }

    public void infoAngajat() {
        infoPerosana();
        System.out.println("Firma: " + firma);
        System.out.println("Experienta: " + experienta);
        System.out.println("Zile de concediu: " + zileConcediu);
    }

    // Suprascriem metoda din parinte (polimorphismul dinamic)
    public void mananca() {
        System.out.println("Angajatul manca cand are pauza de masa");
    }

    // Polimorphismul stati

    public void marire() {
        System.out.println("nu avem marire");
    }

    public void marire(Integer procent) {
        System.out.println("Angajatul a primit o marire cu " + procent + "%");
    }

    public void marire(String grad) {
        System.out.println("Angajatul a primit o marire cu " + grad);
    }

    public void promovare() {
        System.out.println("Promovare angajat" + getNume() + "a fost promovat");
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public Integer getExperienta() {
        return experienta;
    }

    public void setExperienta(Integer experienta) {
        this.experienta = experienta;
    }

    public Integer getZileConcediu() {
        return zileConcediu;
    }

    public void setZileConcediu(Integer zileConcediu) {
        this.zileConcediu = zileConcediu;
    }
}
