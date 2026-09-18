package Jobsheet4.percobaan2;

public class Pelanggan {
    private String nama;
    private mobil mobil;
    private Sopir sopir;
    private int hari;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setMobil(mobil mobil) {
        this.mobil = mobil;
    }

    public mobil getMobil(){
        return mobil;
    }

    public void setSopir(Sopir sopir){
        this.sopir = sopir;
    }

    public Sopir getSopir(){
        return sopir;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getHari(){
        return hari;
    }

    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSupir(hari);
    }
}
