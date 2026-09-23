package id.ac.polinema.relasiclass.percobaan3;

public class Mainpercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spogebob");
        Pegawai asisten = new Pegawai("4567", "Patrick");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
