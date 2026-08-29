public class Mouse {

    // atribut
    String brand;
    int dpi;


    // methodnya

    public Mouse(String brand, int dpi) {
        this.brand = brand;
        this.dpi = dpi;
    }

    public void Klik() {
        System.out.println("Mouse diklik.");
    }

    public void ubahDPI(int dpi) {
        this.dpi = dpi;
        System.out.println("DPI mouse diubah menjadi: " + dpi);
    }

    public void cetakInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("DPI: " + dpi);
    }
}
