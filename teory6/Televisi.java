public class Televisi {
    public String merk;
    public int jumlahChannel;
    private int channelAktif;

    public Televisi() {
        this.merk = "Samsung";
        this.jumlahChannel = 0;
        this.channelAktif = 1;
    }

    public Televisi(String merk, int jumlahChannel) {
        this.merk = merk;
        this.jumlahChannel = jumlahChannel;
        this.channelAktif = 1;
    }

    public void pindahChannel(int channel) {
        if (channel >= 1 && channel <= jumlahChannel) {
            channelAktif = channel;
        } else {
            System.out.println("Channel tidak valid!");
        }
    }

    public int getChannelAktif() {
        return channelAktif;
    }
}
