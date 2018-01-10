package Department_Store;

import Department_Store.Items.Item;

import java.util.ArrayList;

public class Department {
    private String departmentName;
    private int floorNumber;
    private ArrayList<Item> stock;

    public Department(String departmentName, int floorNumber){
        this.departmentName = departmentName;
        this.floorNumber = floorNumber;
        this.stock = new ArrayList<Item>();

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
}
