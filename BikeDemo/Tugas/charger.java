package Tugas;

public class charger {
    public String jenisCharger;
    public int kecepatan;

    public void setJenisCharger(String jenisCharger) {
        this.jenisCharger = jenisCharger;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void cetakInfo() {
        System.out.println("Charger Jenis: " + jenisCharger + ", Kecepatan: " + kecepatan);
    }
}
