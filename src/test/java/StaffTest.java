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


}
