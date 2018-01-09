import Department_Store.Department;
import Department_Store.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DepartmentTest {

    Department department;
    Item stock;

    @Before
    public void before(){
        department = new Department("Menswear", 1);
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
        department.addStock(stock);
        assertEquals(1, department.getStockCount());
    }
}
