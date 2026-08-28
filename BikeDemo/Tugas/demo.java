package Tugas;

public class demo {
    public static void main(String[] args) {
        ac ac1 = new ac();
        ac1.setMerk("politron");
        ac1.setSuhu(22);
        ac1.cetakInfo();

        monitor monitor1 = new monitor();
        monitor1.setMerk("Samsung");
        monitor1.setResolusi(1080);
        monitor1.cetakInfo();

        chargerHp charger1 = new chargerHp();
        charger1.setJenisCharger("Charger HP");
        charger1.setKecepatan(33);
        charger1.setTipe("USB-C");
        charger1.setTegangan(12);
        charger1.cetakInfo();

        chargerLaptop charger2 = new chargerLaptop();
        charger2.setJenisCharger("Charger Laptop");
        charger2.setKecepatan(100);
        charger2.setDaya(65);
        charger2.setPanjangKabel(150);
        charger2.cetakInfo();
    }
}
