package id.ac.polinema.relasiclass.tugasmandiri;

public class Pendaftaran {
    // BUKTI DEPENDENCY
    public void daftar(Pasien pasien, Dokter dokter) {
        System.out.println(">> " + pasien.info() + " didaftarkan ke " + dokter.info());
    }
}
