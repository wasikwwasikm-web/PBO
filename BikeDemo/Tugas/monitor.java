package Tugas;

public class monitor {
    public String merk;
    public int resolusi;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setResolusi(int resolusi) {
        this.resolusi = resolusi;
    }

    public void cetakInfo() {
        System.out.println("Monitor Merk: " + merk + ", Resolusi: " + resolusi);
    }
}
