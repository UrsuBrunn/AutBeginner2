package OOP;

public class Student extends Persoana implements StudentInt{

    private String facultate;
    private Integer anul;
    private Boolean bursa;

    public Student(String nume, String prenume, Integer varsta, String facultate, Integer anul, Boolean bursa) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.anul = anul;
        this.bursa = bursa;
    }

    public void infoStudent() {
        infoPerosana();
        System.out.println("Facultatea este : " + facultate);
        System.out.println("Anul este : " + anul);
        System.out.println("Are studentul bursa? " + bursa);
    }

    public void absolvire() {
        System.out.println("Studentul cu numele " + getNume() + getPrenume() + "a absolvit");
    }

    public void mananca() {
        System.out.println("Studentul manca cand are vreme ");
        super.mananca();
    }

    public String getFacultate() {
        return facultate;
    }

    public Boolean getBursa() {
        return bursa;
    }

    public Integer getAnul() {
        return anul;
    }

    public void setAnul(Integer anul) {
        this.anul = anul;
    }

    public void setBursa(Boolean bursa) {
        this.bursa = bursa;
    }

    @Override
    public void mergeLaCurs() {
        System.out.println("Studentul merge curs ");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul sustine examene ");
    }

    @Override
    public void mergeLaCafea() {
        System.out.println("Studentul merge la cafea ");
    }
}
