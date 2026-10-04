package Quis;

public class SpaceShuttle {
    private String kode;
    private int berat;
    private Roket roketUtama;
    private Generator generatorUtama;

    public SpaceShuttle(String kode, int berat, Roket roketUtama, Generator generatorUtama) {
        this.kode = kode;
        this.berat = berat;
        this.roketUtama = roketUtama;
        this.generatorUtama = generatorUtama;
    }

    public void setkode(String kode, int berat, Roket roketUtama, Generator generatorUtama) {
        this.kode = kode;
    }

    public String getkode() {
        return kode;
    }

    public void setroketUtama(Roket roketUtama) {
        this.roketUtama = roketUtama;
    }

    public Roket getroketUtama() {
        return roketUtama;
    }

    public void setgeneratorUtama(Generator generatorUtama) {
        this.generatorUtama = generatorUtama;
    }

    public Generator getgeneratorUtama() {
        return generatorUtama;
    }

    public void setberat(int berat) {
        this.berat = berat;
    }

    public int getberat() {
        return berat;
    }
}
