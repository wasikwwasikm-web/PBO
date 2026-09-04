package Praktikum2;

public class testLingkaran {
    public static void main(String[] args) {
        lingkaran lingkaran1 = new lingkaran();
        lingkaran1.r = 28.0;

        double luas = lingkaran1.hitungLuas();
        double keliling = lingkaran1.hitungKeliling();

        System.out.println("Luas Lingkaran : " + luas);
        System.out.println("Keliling Lingkaran : " + keliling);
    }
}
