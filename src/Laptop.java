public class Laptop {

    String brand;
    String processor;

    public Laptop(String brand, String processor) {
        this.brand = brand;
        this.processor = processor;
    }

    public void nyalakan() {

        System.out.println("Laptop Dinyalakan");
    }

    public void matikan() {
        System.out.println("Laptop Dimatikan");
    }

    public void cetakInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
    }
}