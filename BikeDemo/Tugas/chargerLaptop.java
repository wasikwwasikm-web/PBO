package Tugas;

public class chargerLaptop extends charger {
    private int daya;
    private int panjangKabel;

    public void setDaya(int daya) {
        this.daya = daya;
    }

    public void setPanjangKabel(int panjangKabel) {
        this.panjangKabel = panjangKabel;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Daya: " + daya + " Watt");
        System.out.println("Panjang Kabel: " + panjangKabel + " cm");
    }

}
