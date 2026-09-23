package id.ac.polinema.relasiclass.percobaan2;

public class Mobil {
    private String merk;
    private int biaya;

    public Mobil() {
    }

    public void setmerk(String merk) {
        this.merk = merk;
    }

    public String getmerk() {
        return merk;
    }

    public void setbiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getbiaya() {
        return biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
