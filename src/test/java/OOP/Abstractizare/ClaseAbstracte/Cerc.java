package OOP.Abstractizare.ClaseAbstracte;

public class Cerc extends FormeGeometrice {
    private int raza;
    @Override
    public void caclculArie() {
        System.out.println("Aria cercurlui este: " + Math.PI*Math.pow(raza,2));
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
}
