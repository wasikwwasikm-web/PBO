package Praktikum7.Tugas;

public class mainSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Total Sudut: " + s.totalSudut(60));
        System.out.println("Total Sudut: " + s.totalSudut(60, 30));
        System.out.println("Keliling: " + s.keliling(3, 4, 5));
        System.out.println("Keliling: " + s.keliling(3, 4));
    }
}
