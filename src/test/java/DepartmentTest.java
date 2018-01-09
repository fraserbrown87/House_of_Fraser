import Department_Store.Department;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DepartmentTest {

    Department department;

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
    public void departmentStockStartsEmpty(){
        assertEquals(0, department.getStockCount());
    }
}
