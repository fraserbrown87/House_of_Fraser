package Staff;

import Customer.Customer;
import Department_Store.Department;
import Department_Store.Items.Item;

public class SalesAssistant extends Employee {

    Department dept;
    Item item1;

    public SalesAssistant(String name, String NINumber, int salary, Department dept){
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

    public Department getDepartment(){
        return this.dept;
    }

    public void setDepartment(Department dept){
        this.dept = dept;
    }

    public void sellItem(Customer cust, Item item1){
        double itemPrice = item1.getSellPrice();
        double custWallet = cust.getCustomerWallet();

        double newCustWallet = custWallet - itemPrice;
        cust.setCustomerWallet(newCustWallet);
    }
}
