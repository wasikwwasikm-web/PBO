package Praktikum2;

public class peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int lamaPinjam;
    public double harga;

    public void tampilData() {
        System.out.println("ID Peminjaman : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game : " + namaGame);
        System.out.println("Lama Pinjam : " + lamaPinjam + " hari");
        System.out.println("Harga Sewa : " + harga);
        System.out.println("Total Harga : " + tampilHarga());
    }

    public double tampilHarga() {
        return lamaPinjam * harga;
    }
}
