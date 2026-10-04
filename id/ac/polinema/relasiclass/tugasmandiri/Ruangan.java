package id.ac.polinema.relasiclass.tugasmandiri;

public class Ruangan {
    private String nomor;

    public Ruangan(String nomor) {
        this.nomor = nomor;
    }

    public String info() {
        return "Ruangan " + nomor;
    }
}
