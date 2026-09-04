package Praktikum2;

public class testBarang {
    public static void main(String[] args) {
        barang brg1 = new barang();
        brg1.namaBrg = "Pensil";
        brg1.jnsBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();

        System.out.println("Stok Baru adalah " + brg1.tambahStok(20));
    }
}
