import Customer.Customer;
import Department_Store.Department;
import Department_Store.Items.Brands;
import Department_Store.Items.Item;
import Department_Store.Items.ItemSpec;
import Staff.Manager;
import Staff.SalesAssistant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StaffTest {

    SalesAssistant salesAssistant;
    Department department;
    Manager manager;
    Customer customer;
    Item item1;
    ItemSpec itemSpec1;

    @Before
    public void before(){
        department = new Department("Menswear", 1);
        salesAssistant = new SalesAssistant("Tom Cruise", "JR 57 48 21 A", 18000, department);
        manager = new Manager("Bill Lumbergh", "JR 44 33 22 J", 30000);
        customer = new Customer("Fraser Brown", 500.0);
        itemSpec1 = new ItemSpec(Brands.FRED_PERRY, "Shirt");
        item1 = new Item(itemSpec1, 100.0, 50.0, 10);
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
        assertEquals(department, salesAssistant.getDepartment());
    }

    @Test
    public void setDepartment(){
        salesAssistant.setDepartment(department);
        assertEquals(department, salesAssistant.getDepartment());
    }

    @Test
    public void sellItem(){
        customer.addItemToBasket(item1);
        salesAssistant.sellItem(customer, item1);
        assertEquals(400, customer.getCustomerWallet(),0.1);
    }



}
