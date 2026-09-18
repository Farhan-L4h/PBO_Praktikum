package Jobsheet4.percobaan2;

public class mobil {
    private String merk;
    private int biaya;

    public mobil() {

    }

    public mobil(String merk) {
        this.merk = merk;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
