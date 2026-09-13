import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Kontainer kontainerA =
            new Kontainer("RESI-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: "
                + kontainerA.getNamaPemilik());

        System.out.println("Kapasitas Maksimal: "
                + kontainerA.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan berat muatan (kg): ");
        double tambah = input.nextDouble();

        kontainerA.tambahMuatan(tambah);

        System.out.println("Berat muatan saat ini: "
                + kontainerA.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin dibongkar (kg): ");
        double turun = input.nextDouble();

        kontainerA.turunkanMuatan(turun);

        System.out.println("Berat muatan saat ini: "
                + kontainerA.getBeratMuatanSaatIni() + " kg");

        input.close();
    }
}
