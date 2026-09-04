package Praktikum2;

public class testPeminjaman {
    public static void main(String[] args) {
        peminjaman peminjaman1 = new peminjaman();
        peminjaman1.id = 1;
        peminjaman1.namaMember = "Paijo";
        peminjaman1.namaGame = "Call of Duty";
        peminjaman1.lamaPinjam = 3;
        peminjaman1.harga = 5.000;

        peminjaman1.tampilData();
    }
}
