package Quis;

public class Roket {
    private String type;
    private int power;

    public Roket() {
    }

    public Roket(String type, int power) {
        this.type = type;
        this.power = power;
    }

    public void settype(String type) {
        this.type = type;
    }

    public String gettype() {
        return type;
    }
}
