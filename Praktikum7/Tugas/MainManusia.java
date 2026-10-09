package Praktikum7.Tugas;

public class MainManusia {
    public static void main(String[] args) {
        Manusia m1 = new Manusia();
        Manusia m2 = new Dosen();
        Manusia m3 = new Mahasiswa();

        System.out.println("=== Manusia ===");
        m1.bernafas();
        m1.makan();

        System.out.println("\n=== Dosen ===");
        m2.bernafas();
        m2.makan(); // Overriding

        System.out.println("\n=== Mahasiswa ===");
        m3.bernafas();
        m3.makan(); // Overriding

        // Untuk memanggil method khusus
        System.out.println("\n=== Method Khusus ===");
        if (m2 instanceof Dosen) {
            ((Dosen) m2).lembur();
        }
        if (m3 instanceof Mahasiswa) {
            ((Mahasiswa) m3).tidur();
        }
    }
}
