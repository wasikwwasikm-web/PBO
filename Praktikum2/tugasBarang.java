package Praktikum2;

public class tugasBarang {
    public int kodeBrg;
    public String namaBrg;
    public int hargaDasar;
    public float diskon;

    public void tampilData() {
        System.out.println("Kode Barang : " + kodeBrg);
        System.out.println("Nama Barang : " + namaBrg);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon : " + diskon + "%");
    }

    public double hitungHargaJual() {
        double hargaJual = hargaDasar - (diskon / 100 * hargaDasar);
        return hargaJual;
    }
}
