public class Keyboard {

    // Atribut
    String brand;
    String type;

    // methodnya
    public Keyboard(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public void mengetik() {
        System.out.println("Tombol keyboard ditekan.");
    }

    public void lampuKeyboard() {
        System.out.println("Lampu keyboard menyala.");
    }

    public void cetakInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
    }
}
