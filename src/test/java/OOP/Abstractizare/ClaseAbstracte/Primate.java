package OOP.Abstractizare.ClaseAbstracte;

public class Primate extends Animale{
    private int picioare;
    private int maini;

    @Override
    public void caracteristici() {
        System.out.println("Numarul de membre ale primatelor sunt: " + picioare + " picioare " + maini + " maini");
    }

    public int getPicioare() {
        return picioare;
    }

    public void setPicioare(int picioare) {
        this.picioare = picioare;
    }

    public int getMaini() {
        return maini;
    }

    public void setMaini(int maini) {
        this.maini = maini;
    }
}
