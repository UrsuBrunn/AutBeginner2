package OOP.Abstractizare.ClaseAbstracte;

public class Patrat extends FormeGeometrice {
    private int latura;
    @Override
    public void caclculArie() {
        System.out.println("aria patratului e: " + latura * latura);
    }

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }
}
