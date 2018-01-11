package Staff;

public class Employee {

    private String name;
    private String NINumber;
    private int salary;
    private String department;

    public Employee(String name, String NINumber, int salary, String department){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
        this.department = department;
    }

    public String getEmployeeName() {
        return name;
    }

    public void setEmployeeName(String employeeName) {
        this.name = employeeName;
    }
}
