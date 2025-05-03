package OOP;

public class Student extends Persoana {

    public String facultate;
    public Integer anul;
    public Boolean bursa;

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


}
