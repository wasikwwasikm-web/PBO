package Praktikum6.Tugas;

public class TiketPesawat extends Tiket {
    protected String maskapai;
    protected int beratBagasi;

    public TiketPesawat() {
    }

    public TiketPesawat(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar,
            String maskapai, int beratBagasi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar);
        this.maskapai = maskapai;
        this.beratBagasi = beratBagasi;
    }

    public int hitungBiayaBagasi() {
        int kelebihanBagasi = Math.max(beratBagasi - 20, 0);
        return kelebihanBagasi * 50000;
    }

    public void tampilPesawat() {
        super.tampilTiket();
        System.out.println("Maskapai        = " + maskapai);
        System.out.println("Berat Bagasi    = " + beratBagasi + " kg");
        System.out.println("Biaya Bagasi    = " + hitungBiayaBagasi());
    }
}
