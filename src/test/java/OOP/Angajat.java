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

    public void promovare() {
        System.out.println("Promovare angajat" + getNume() + "a fost rpomovat");
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
