package Tugas;

public class charger {
    public String merk;
    public int kecepatan;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void cetakInfo() {
        System.out.println("Charger Merk: " + merk + ", Kecepatan: " + kecepatan);
    }
}
