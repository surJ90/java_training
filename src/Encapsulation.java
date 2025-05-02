class Employee {
    private int empId;
    private String name;
    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Suraj");
        System.out.println("Id: " + emp.getEmpId() + "\nName: " + emp.getName());
        emp.setName("Dhruva");
        System.out.println("Id: " + emp.getEmpId() + "\nName: " + emp.getName());
    }
}
