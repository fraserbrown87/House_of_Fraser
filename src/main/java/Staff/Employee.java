package Staff;

import Department_Store.Department;

public abstract class Employee {

    protected String name;
    protected String NINumber;
    protected int salary;

    public Employee(String name, String NINumber, int salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

}
