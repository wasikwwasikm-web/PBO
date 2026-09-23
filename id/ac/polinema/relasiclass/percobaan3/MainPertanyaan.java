package id.ac.polinema.relasiclass.percobaan3;

public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Bob");
        KeretaApi keretaApi = new KeretaApi("Gaya baru", "Bisnis", masinis);
        System.out.println(keretaApi.info());
    }
}
