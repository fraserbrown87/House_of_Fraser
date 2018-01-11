import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StaffTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Tom Cruise", "JR 57 48 21 A", 18000, "Menswear");
    }

    @Test
    public void hasEmployeeName(){
        assertEquals("Tom Cruise", employee.getEmployeeName());
    }

    @Test
    public void setEmployeeName(){
        employee.setEmployeeName("Val Kilmer");
        assertEquals("Val Kilmer", employee.getEmployeeName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JR 57 48 21 A", employee.getNINumber());
    }

    @Test
    public void setNINumber(){
        employee.setNINumber("JR 47 23 18 J");
        assertEquals("JR 47 23 18 J", employee.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(18000, employee.getSalary());
    }

    @Test
    public void setSalary(){
        employee.setSalary(19000);
        assertEquals(19000, employee.getSalary());
    }

    @Test
    public void hasDepartment(){
        assertEquals("Menswear", employee.getDepartment());
    }

    @Test
    public void setDepartment(){
        employee.setDepartment("Footwear");
        assertEquals("Footwear", employee.getDepartment());
    }


}
