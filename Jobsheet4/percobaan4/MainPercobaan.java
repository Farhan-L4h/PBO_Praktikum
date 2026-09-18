package Jobsheet4.percobaan4;

public class MainPercobaan {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr jackowi");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
    }
}
