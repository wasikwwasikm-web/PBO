package id.ac.polinema.relasiclass.tugasmandiri;

public class Klinik {
    private String nama;

    // AGGREGATION
    private Dokter[] daftarDokter;

    // COMPOSITION
    private Ruangan[] daftarRuangan;

    public Klinik(String nama, Dokter[] daftarDokter, int jumlahRuangan) {
        this.nama = nama;

        // AGGREGATION
        this.daftarDokter = daftarDokter;

        // COMPOSITION
        this.daftarRuangan = new Ruangan[jumlahRuangan];
        this.initRuangan();
    }

    // BUKTI COMPOSITION
    private void initRuangan() {
        for (int i = 0; i < daftarRuangan.length; i++) {
            this.daftarRuangan[i] = new Ruangan("R" + (i + 1));
        }
    }

    public String info() {
        String info = "=== KLINIK " + nama + " ===\n";

        for (Dokter d : daftarDokter) {
            info += d.info() + "\n";
        }
        for (Ruangan r : daftarRuangan) {
            info += r.info() + "\n";
        }
        return info;
    }
}
