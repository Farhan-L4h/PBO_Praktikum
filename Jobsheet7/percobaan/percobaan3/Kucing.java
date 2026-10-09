package Jobsheet7.percobaan.percobaan3;

public class Kucing {
    private String nama;
    private int umur;

    public Kucing(String nama) {
        this(nama, 1);
        System.out.println("Konstruktor 1 paramenter Selesai");
    }

    public Kucing(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void info(){
        System.out.println("Kucing " + nama + ", Umur " + " tahun");
    }
}
