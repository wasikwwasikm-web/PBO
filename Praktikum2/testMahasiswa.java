package Praktikum2;

public class testMahasiswa {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        mahasiswa mhs2 = new mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Rizky";
        mhs2.alamat = "Jl. Vinolia No 1B";
        mhs2.kelas = "1B";
        mhs2.tampilBiodata();

        mahasiswa mhs3 = new mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Dewi";
        mhs3.alamat = "Jl. Vinolia No 1C";
        mhs3.kelas = "1C";
        mhs3.tampilBiodata();
    }
}
