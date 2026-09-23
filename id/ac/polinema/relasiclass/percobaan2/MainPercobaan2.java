package id.ac.polinema.relasiclass.percobaan2;

public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setmerk("Avanza");
        m.setbiaya(350000);

        Sopir s = new Sopir();
        s.setnama("John Doe");
        s.setbiaya(200000);

        Pelanggan p = new Pelanggan();
        p.setnama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);

        System.out.println("Biaya Total = " + p.hitungBiayaTotal());
        System.out.println(p.getMobil().getmerk());
    }
}
