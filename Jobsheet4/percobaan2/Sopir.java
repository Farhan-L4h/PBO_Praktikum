package Jobsheet4.percobaan2;

public class Sopir {
    private String nama;
    private int biaya;

    public void setBiaya(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaSupir(int hari) {
        return biaya * hari;
    }

}
