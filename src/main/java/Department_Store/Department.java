package Department_Store;

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

    public int getStockCount() {
        return stock.size();
    }
}
