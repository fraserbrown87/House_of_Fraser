import Department_Store.Department;
import Staff.SalesAssistant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StaffTest {

    SalesAssistant salesAssistant;
    Department department;

    @Before
    public void before(){
        department = new Department("Menswear", 1);
        salesAssistant = new SalesAssistant("Tom Cruise", "JR 57 48 21 A", 18000, department);
    }

    @Test
    public void hasEmployeeName(){
        assertEquals("Tom Cruise", salesAssistant.getEmployeeName());
    }

    @Test
    public void setEmployeeName(){
        salesAssistant.setEmployeeName("Val Kilmer");
        assertEquals("Val Kilmer", salesAssistant.getEmployeeName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JR 57 48 21 A", salesAssistant.getNINumber());
    }

    @Test
    public void setNINumber(){
        salesAssistant.setNINumber("JR 47 23 18 J");
        assertEquals("JR 47 23 18 J", salesAssistant.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(18000, salesAssistant.getSalary());
    }

    @Test
    public void setSalary(){
        salesAssistant.setSalary(19000);
        assertEquals(19000, salesAssistant.getSalary());
    }

    @Test
    public void hasDepartment(){
        assertEquals("Menswear", salesAssistant.getDepartment());
    }

    @Test
    public void setDepartment(){
        salesAssistant.setDepartment("Footwear");
        assertEquals("Footwear", salesAssistant.getDepartment());
    }
    


}
