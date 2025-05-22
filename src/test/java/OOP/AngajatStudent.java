package OOP;

public class AngajatStudent extends Persoana implements AngajatInt, StudentInt {

    public AngajatStudent(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void mergiLaMunca() {
        System.out.println("mergi la munca");
    }

    @Override
    public void primesteSalariul() {
        System.out.println("primeste salariul");
    }

    @Override
    public void mergeInPauza() {
        System.out.println("mergeInPauza");

    }

    @Override
    public void prezintaDemisie() {
        System.out.println("Angajatul nu pleace din firma");
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
