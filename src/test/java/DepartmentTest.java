import Department_Store.Department;
import Department_Store.Items.Item;
import Customer.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DepartmentTest {

    Department department;
    Item item;
    Customer customer;

    @Before
    public void before(){
        department = new Department("Menswear", 1);
        customer = new Customer("John Doe", 300.0);
    }

    @Test
    public void getDepartmentName(){
        assertEquals("Menswear", department.getDepartmentName());
    }

    @Test
    public void setDepartmentName(){
        department.setDepartmentName("Womenswear");
        assertEquals("Womenswear", department.getDepartmentName());
    }

    @Test
    public void getDepartmenFloorNumber(){
        assertEquals(1, department.getDepartmentFloorNumber());
    }

    @Test
    public void setDepartmentFloorNumber(){
        department.setDepartmentFloorNumber(2);
        assertEquals(2, department.getDepartmentFloorNumber());
    }

    @Test
    public void departmentStockStartsEmpty(){
        assertEquals(0, department.getStockCount());
    }

    @Test
    public void canAddStockToDepartment(){
        department.addStock(item);
        assertEquals(1, department.getStockCount());
    }

    @Test
    public void canRemoveStockFromDepartment(){
        department.addStock(item);
        assertEquals(1, department.getStockCount());
        department.removeStock(item);
        assertEquals(0, department.getStockCount());
    }

    @Test
    public void canAddSevenToFloorNum() {
        department.addOneToFloor();
        assertEquals(8, department.getDepartmentFloorNumber());
    }

    @Test
    public void departmentCustomersStartEmpty(){
        assertEquals(0, department.getCustomerCount());
    }

    @Test
    public void canAddCustomerToDepartment(){
        department.addCustomer(customer);
        assertEquals(1, department.getCustomerCount());
    }

    @Test
    public void canRemoveCustomerFromDepartment(){
        department.addCustomer(customer);
        assertEquals(1, department.getCustomerCount());
        department.removeCustomer(customer);
        assertEquals(0, department.getCustomerCount());
    }
}
