package Staff;

import Department_Store.Department;

public class SalesAssistant extends Employee {

    Department dept;

    public SalesAssistant(String name, String NINumber, int salary){
        super(name, NINumber, salary);
        this.dept = dept;
    }

    public String getEmployeeName() {
        return name;
    }

    public void setEmployeeName(String employeeName) {
        this.name = employeeName;
    }

    public String getNINumber() {
        return NINumber;
    }

    public void setNINumber(String NINumber) {
        this.NINumber = NINumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department getDept(){
        return dept;
    }
}
