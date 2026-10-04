package id.ac.polinema.relasiclass.tugasmandiri;

public class MainTugas {
    public static void main(String[] args) {

        // AGGREGATION
        Dokter[] dokter = new Dokter[] {
                new Dokter("Andi", "Umum"),
                new Dokter("Budi", "Gigi")
        };

        // COMPOSITION
        Klinik klinik = new Klinik("Sehat Selalu", dokter, 2);
        System.out.println(klinik.info());

        // DEPENDENCY
        Pasien pasien = new Pasien("Dewi");
        Pendaftaran pendaftaran = new Pendaftaran();
        pendaftaran.daftar(pasien, dokter[0]);
    }
}
