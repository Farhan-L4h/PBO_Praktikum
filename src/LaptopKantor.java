public class LaptopKantor extends Laptop {


    // atribut tambaha
    int kapasistasBaterai;
    double berat;

    public LaptopKantor(String brand, String processor, int kapasistasBaterai, double berat) {
        super(brand, processor);
        

        // inisiasi atribut tambahan
        this.kapasistasBaterai = kapasistasBaterai;
        this.berat = berat;

    }


    // Metod tambahan
    public void modeHematDaya() {
        System.out.println("Mode Hemat Daya diaktifkan.");
    }

    public void bukaDokumen() {
        System.out.println("Laptop Kantor sedang digunakan untuk membuka dokumen.");
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Laptop Kantor Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("Kapasitas Baterai: " + kapasistasBaterai + " mAh");
        System.out.println("Berat: " + berat + " kg");
    }
}