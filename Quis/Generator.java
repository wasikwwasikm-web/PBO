package Quis;

public class Generator {
    private int daya;
    private int voltase;

    public Generator(int daya, int voltase) {
        this.daya = daya;
        this.voltase = voltase;
    }

    public void setvoltase(int voltase) {
        this.voltase = voltase;
    }

    public int getvoltase() {
        return voltase;
    }
}
