public class TelevisiModern extends Televisi {
    private String displayMode;
    private String dvd;

    public TelevisiModern(String merk, int jumlahChannel) {
        super(merk, jumlahChannel);
        this.displayMode = "HDMI";
        this.dvd = "";
    }

    public void gantiModeTampilan(String mode) {
        this.displayMode = mode;
    }

    public void mainkanDVD() {
        if (dvd == null || dvd.isEmpty()) {
            System.out.println("Sedang memainakn DVD: kosong");
        } else {
            System.out.println("Sedang memainakn DVD: " + dvd);
        }
    }

    public void masukkanDVD(String judul) {
        this.dvd = judul;
    }
}
