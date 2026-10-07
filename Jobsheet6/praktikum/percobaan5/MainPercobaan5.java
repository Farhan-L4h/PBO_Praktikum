package praktikum.percobaan5;

public class MainPercobaan5 {
    public static void main(String[] args) {
        Desktop desk = new Desktop("Lenovo", 2048, 5600, "Cannon");
        Laptop Lap = new Laptop("Thinkpad", 4096, 2500, 1080);
    
    desk.showInfo();
    System.out.println();
    Lap.showInfo();
    System.out.println();
    desk.nyalainKomputer();
    }
}
