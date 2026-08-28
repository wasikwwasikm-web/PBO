package Tugas;

public class ac {
    public String merk;
    public int suhu;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }

    public void cetakInfo() {
        System.out.println("AC Merk: " + merk + ", Suhu: " + suhu + " Celcius");
    }
}
