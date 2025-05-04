package OOP.Abstractizare.Interfete;

public class Patrat implements FormeGeometrice{

    private int latura;

    @Override
    public void calculeazaArie() {
        System.out.println("aria patratului e: " + latura * latura);
    }

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }

    @Override
    public void deseneaza() {

    }
}
