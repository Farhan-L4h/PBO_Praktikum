package Jobsheet3.koperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Farhan", "Suhat");
        // anggota1.setNama("Farhan Tes");
        System.out.println("Simpanan" + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
        
        anggota1.setAlamat("Suhat");
        anggota1.setor(100000);
        System.out.println("Simpanan" + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);

        System.out.println("Simpanan" + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}
