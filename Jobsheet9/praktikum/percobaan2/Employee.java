package praktikum.percobaan2;
public class Employee {
    protected String name;

    public Employee(String name){
        this.name = name;
    }

    public String getEmployeeInfo(){
        return "Name = " + name;
    }
}
