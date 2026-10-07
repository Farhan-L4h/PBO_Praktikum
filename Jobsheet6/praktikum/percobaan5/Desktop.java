package praktikum.percobaan5;

public class Desktop extends Komputer {
    protected String printer;

    public Desktop(String merk, int memory, int cpu, String printer) {
        super(merk, memory, cpu);
        this.printer = printer;
    }

    // @Override
    public void showinfo(){
        super.showInfo();
        System.out.println("Printer :" + printer);
    }
}