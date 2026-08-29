public class LaptopGaming extends Laptop {

    // atribut
    String gpu;
    int ram;


    // methodnya
    public LaptopGaming(String brand, String processor, String gpu, int ram) {

        super(brand, processor);

        this.gpu = gpu;
        this.ram = ram;
    }

    public void mainGame() {
        System.out.println("Laptop Gaming sedang digunakan untuk bermain game.");
    }

    public void modeGameOn() {
        System.out.println("Mode Game On diaktifkan.");
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("GPU: " + gpu);
        System.out.println("RAM: " + ram + "GB");
    }
}
