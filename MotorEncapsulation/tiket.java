package MotorEncapsulation;

public class tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    public tiket(String judulFilm, double hargaDasar) {
        this.judulFilm = judulFilm;
        this.statusPembayaran = false;

        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }

    public void lakukanPembayaran() {
        this.statusPembayaran = true;
    }
}
