import Department_Store.Department;
import Staff.Manager;
import Staff.SalesAssistant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Department department;
    Department department2;
    SalesAssistant salesAssistant;
    Manager manager;

    @Before
    public void before(){
        department = new Department("Menswear", 1);
        department2 = new Department("Footwear", 2);
        salesAssistant = new SalesAssistant("Tom Cruise", "JR 57 48 21 A", 18000, department);
        manager = new Manager("Bill Lumbergh", "JR 44 33 22 J", 30000);
    }

    @Test
    public void canMoveEmployee(){
        manager.moveEmployee(salesAssistant, department2);
        assertEquals(department2, salesAssistant.getDepartment());
    }
}
