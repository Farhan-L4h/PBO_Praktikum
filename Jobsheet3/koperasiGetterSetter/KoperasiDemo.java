package Jobsheet3.koperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();
        anggota1.setNama("Farhan Tes");
        anggota1.setAlamat("Suhat");
        anggota1.setor(100000);
        System.out.println("Simpan" +anggota1.getNama()+ " : Rp " + anggota1.getSimpanan());
        
        anggota1.pinjam(5000);

        System.out.println("Simpan" +anggota1.getNama()+ " : Rp " + anggota1.getSimpanan());
    }
}
