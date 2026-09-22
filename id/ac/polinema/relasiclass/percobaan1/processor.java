package id.ac.polinema.relasiclass.percobaan1;

public class processor {
    private String merk;
    private double cache;

    public processor() {
    }

    public processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public void setmerk(String merk) {
        this.merk = merk;
    }

    public String getmerk() {
        return merk;
    }

    public void setcache(double cache) {
        this.cache = cache;
    }

    public double getcache() {
        return cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
