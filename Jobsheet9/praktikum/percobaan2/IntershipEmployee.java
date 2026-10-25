package praktikum.percobaan2;
public class IntershipEmployee extends Employee {

    private int length;

    public IntershipEmployee(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Register As Intership Employee For " +  length + " month/s\n";

        return info;
    }

    
}
