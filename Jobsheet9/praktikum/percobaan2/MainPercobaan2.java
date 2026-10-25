package praktikum.percobaan2;

public class MainPercobaan2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        Employee e;
        e = pEmp;

        System.out.println("------------------");
        System.out.println(e.getEmployeeInfo());
        System.out.println(pEmp.getEmployeeInfo());

        IntershipEmployee iEmp = new IntershipEmployee("ferdi", 5);
        e = iEmp;
        System.out.println("------------------");
        System.out.println(e.getEmployeeInfo());

    }

}
