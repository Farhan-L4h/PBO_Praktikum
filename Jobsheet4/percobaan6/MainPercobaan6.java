package Jobsheet4.percobaan6;

public class MainPercobaan6 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Thinkbook");
        Printer printer = new Printer("Cannon 360");
        laptop.cetakDokumen(printer, "Laporan.pdf");
    }
}
