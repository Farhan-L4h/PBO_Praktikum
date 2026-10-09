package Jobsheet7.percobaan.percobaan4;

public class MainPercobaan {
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Piranha c = new Piranha();

        a.swim();
        c.swim();

        Piranha anak = c.beranak();
        System.out.println("Tipe objek anak:" + anak.getClass().getSimpleName());
    }
}
