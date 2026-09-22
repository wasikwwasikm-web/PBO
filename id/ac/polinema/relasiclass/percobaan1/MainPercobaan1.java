package id.ac.polinema.relasiclass.percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        processor p = new processor("itel i9", 3);
        Laptop l = new Laptop("Thikpad", p);
        l.info();

        processor p1 = new processor();
        p1.setmerk("Itel i5");
        p1.setcache(4);
        Laptop l1 = new Laptop();
        l1.setmerk("Thinkpad");
        l1.setproc(p1);
        l1.info();

        Laptop l2 = new Laptop("Thinkpad",
                new processor("Itel i8", 3));
        l2.info();
    }

}
