package OOP.Abstractizare.ClaseAbstracte;

public class Feline extends Animale{
    private int picioare;

    @Override
    public void caracteristici() {
        System.out.println("Numarul de membre ale felinelor sunt sunt: " + picioare + " picioare");
    }

    public int getPicioare() {
        return picioare;
    }

    public void setPicioare(int picioare) {
        this.picioare = picioare;
    }

}
