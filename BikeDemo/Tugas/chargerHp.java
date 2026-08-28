package Tugas;

public class chargerHp extends charger {
    public String tipe;
    public int tegangan;

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setTegangan(int tegangan) {
        this.tegangan = tegangan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tipe Charger: " + tipe + ", Tegangan: " + tegangan + " V");
    }
}
