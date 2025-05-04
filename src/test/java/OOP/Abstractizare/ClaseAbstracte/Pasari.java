package OOP.Abstractizare.ClaseAbstracte;

public class Pasari extends Animale{
    private int picioare;
    private int aripi;

    @Override
    public void caracteristici() {
        System.out.println("Numarul de membre ale pasarilor sunt: " + picioare + " picioare " + aripi + " aripi");
    }

    public int getPicioare() {
        return picioare;
    }

    public void setPicioare(int picioare) {
        this.picioare = picioare;
    }

    public int getAripi() {
        return aripi;
    }

    public void setAripi(int aripi) {
        this.aripi = aripi;
    }
}
