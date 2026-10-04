package Praktikum6.percobaan5n6;

public class StaffHarian extends Staff {
    public int jlmJamKerja;

    public StaffHarian() {

    }

    public StaffHarian(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan,
            int jlmJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jlmJamKerja = jlmJamKerja;
    }

    public void tampilStaffHarian() {
        System.out.println("======== Data Staff Harian ========");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja: " + jlmJamKerja);
        System.out.println(" Gaji bersih: " + (gaji * jlmJamKerja + lembur - potongan));
    }
}
