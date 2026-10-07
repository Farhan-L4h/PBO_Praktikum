package Tugas.Televisi;

public class Televisi {
    protected String merk;
    protected int jumlahChannel;
    private int channelAktif;

    public Televisi(String merk, int jumlahChannel) {
        this.merk = merk;
        this.jumlahChannel = jumlahChannel;
        this.channelAktif = 1;
    }

    public void pindahChannel(int channel) {
        if (channel >= 1 && channel <= jumlahChannel) {
            channelAktif = channel;
        }
    }

    public int getChannelAktif() {
        return channelAktif;
    }
}
