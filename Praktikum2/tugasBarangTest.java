package Praktikum2;

public class tugasBarangTest {
    public static void main(String[] args) {
        tugasBarang barang1 = new tugasBarang();
        barang1.kodeBrg = 1;
        barang1.namaBrg = "Laptop";
        barang1.hargaDasar = 1000000;
        barang1.diskon = 10.0f;

        double hargaJual = barang1.hitungHargaJual();
        barang1.tampilData();
        System.out.println("Harga Jual : " + hargaJual);
    }
}
