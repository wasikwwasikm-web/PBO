package id.ac.polinema.relasiclass.percobaan1;

public class Laptop {
    private String merk;
    private processor proc;

    public Laptop() {
    }

    public Laptop(String merk) {
        this.merk = merk;
        this.proc = new processor("Generik", 1);
    }

    public void setmerk(String merk) {
        this.merk = merk;
    }

    public String getmerk() {
        return merk;
    }

    public void setproc(processor proc) {
        this.proc = proc;
    }

    public processor getproc() {
        return proc;
    }

    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
