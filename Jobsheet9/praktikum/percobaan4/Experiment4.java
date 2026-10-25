package praktikum.percobaan4;

import praktikum.percobaan2.Employee;
import praktikum.percobaan2.IntershipEmployee;
import praktikum.percobaan2.PermanentEmployee;

public class Experiment4 {
    public static void main(String[] args) {
        Employee e = new IntershipEmployee("Sunarto", 5);
        System.out.println("Sebelum casting");
        PermanentEmployee pe = (PermanentEmployee) e;
        System.out.println("Sesudah casting: " + pe.getSalary());
    }

}
