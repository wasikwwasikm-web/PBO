package id.ac.polinema.relasiclass.tugasmandiri;

public class Pasien {
    private String nama;

    public Pasien(String nama) {
        this.nama = nama;
    }

    public String info() {
        return "Pasien: " + nama;
    }
}
