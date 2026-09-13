public class TestLogistik {
     public static void main(String[] args) {

        Kontainer kontainerA =
            new Kontainer("RESI-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: "
                + kontainerA.getNamaPemilik());

        System.out.println("Kapasitas Maksimal: "
                + kontainerA.getKapasitasMaksimal() + " kg");

        System.out.println("\nMemasukkan muatan baru sebesar 6.000 kg...");
        kontainerA.tambahMuatan(6000);
        System.out.println("Berat muatan saat ini: "
                + kontainerA.getBeratMuatanSaatIni() + " kg");

        System.out.println("\nMemasukkan muatan baru sebesar 4.000 kg...");
        kontainerA.tambahMuatan(4000);
        System.out.println("Berat muatan saat ini: "
                + kontainerA.getBeratMuatanSaatIni() + " kg");

        System.out.println("\nMembongkar/memindahkan barang sebesar 500 kg...");
        kontainerA.turunkanMuatan(500);
        System.out.println("Berat muatan saat ini: "
                + kontainerA.getBeratMuatanSaatIni() + " kg");

        System.out.println("\nMembongkar/memindahkan barang sebesar 1.500 kg...");
        kontainerA.turunkanMuatan(1500);
        System.out.println("Berat muatan saat ini: "
                + kontainerA.getBeratMuatanSaatIni() + " kg");
    }
}
