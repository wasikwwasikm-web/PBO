package Praktikum2;

public class barang {
    public String namaBrg;
    public String jnsBrg;
    public int stok;

    public void tampilBarang() {
        System.out.println("Nama Barang : " + namaBrg);
        System.out.println("Jenis Barang : " + jnsBrg);
        System.out.println("Stok Barang : " + stok);
    }

    public int tambahStok(int brgmasuk) {
        int stokBaru = brgmasuk + stok;
        return stokBaru;
    }
}
