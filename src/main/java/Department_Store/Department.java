package Department_Store;

import Department_Store.Items.Item;
import Customer.Customer;

import java.util.ArrayList;

public class Department {
    private String departmentName;
    private int floorNumber;
    private ArrayList<Item> stock;
    private ArrayList<Customer> customers;

    public Department(String departmentName, int floorNumber){
        this.departmentName = departmentName;
        this.floorNumber = floorNumber;
        this.stock = new ArrayList<Item>();
        this.customers = new ArrayList<Customer>();

    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    public int getDepartmentFloorNumber() {
        return floorNumber;
    }

    public void setDepartmentFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getStockCount() {
        return stock.size();
    }

    public void addStock(Item item) {
        this.stock.add(item);
    }

    public void removeStock(Item item) {
        this.stock.remove(item);
    }

    public void addOneToFloor() {
        this.floorNumber += 7;
    }

    public int getCustomerCount(){
        return customers.size();
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public void removeCustomer(Customer customer){
        this.customers.remove(customer);
    }
}
