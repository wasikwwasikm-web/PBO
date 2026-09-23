package id.ac.polinema.relasiclass.percobaan1;

public class Laptop {
    private String merk;
    private processor proc;

    public Laptop() {
    }

    public Laptop(String merk, processor proc) {
        this.merk = merk;
        this.proc = proc;
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
