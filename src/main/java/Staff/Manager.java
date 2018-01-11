package Staff;

import Department_Store.Department;

public class Manager extends Employee {

    public Manager(String name, String NINumber, int salary){
        super(name, NINumber, salary);
    }

    public void moveEmployee(SalesAssistant employee, Department deptNew){
        employee.setDepartment(deptNew);
    }


}
