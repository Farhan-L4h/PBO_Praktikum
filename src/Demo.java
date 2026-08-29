public class Demo {
    public static void main(String[] args) {

        // Objek Laptop
        Laptop laptop = new Laptop("Lenovo", "Intel Core i7");

        LaptopGaming laptopGaming = new LaptopGaming(
            "Asus", "Intel Core i9", "NVIDIA GeForce RTX 3080", 32
        );

        LaptopKantor laptopKantor = new LaptopKantor(
            "HP", "Intel Core i5", 5000, 1.5
        );

        Keyboard keyboard = new Keyboard("Logitech", "Putih");
        Mouse mouse = new Mouse("Razer", 1600);

        System.out.println("=== Informasi Laptop ===");
        laptop.nyalakan();
        laptop.matikan();
        laptop.cetakInfo();

        // Laptop Gaming
        System.out.println("\n=== Informasi Laptop Gaming ===");
        laptopGaming.mainGame();
        laptopGaming.modeGameOn();
        laptopGaming.cetakInfo();

        // Lapotp Kantor
        System.out.println("\n=== Informasi Laptop Kantor ===");
        laptopKantor.bukaDokumen();
        laptopKantor.modeHematDaya();
        laptopKantor.cetakInfo();

        // keyboard
        System.out.println("\n=== Informasi Keyboard ===");
        keyboard.mengetik();
        keyboard.lampuKeyboard();
        keyboard.cetakInfo();

        // mouse
        System.out.println("\n=== Informasi Mouse ===");
        mouse.Klik();
        mouse.ubahDPI(2000);
        mouse.cetakInfo();
    }
}
