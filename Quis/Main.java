package Quis;

public class Main {
    public static void main(String[] args) {
        Roket rkt = new Roket("Jet", 9000);
        Generator gnt = new Generator(5000, 110);
        SpaceShuttle ss = new SpaceShuttle("Apollo99", 3500, rkt, gnt);

        System.out.println("Kode Shuttle: " + ss.getkode());
        System.out.println("Type roket: " + ss.getroketUtama().gettype());
        System.out.println("Voltase generator: " + ss.getgeneratorUtama().getvoltase());
    }

}
