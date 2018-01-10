import Customer.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("John Doe", 300.0);
    }

    @Test
    public void getCustomerName() {
        assertEquals("John Doe", customer.getCustomerName());
    }

    @Test
    public void setCustomerName() {
        customer.setCustomerName("Jane Doe");
        assertEquals("Jane Doe", customer.getCustomerName());
    }

    @Test
    public void getCustomerWallet(){
        assertEquals(300.0, customer.getCustomerWallet(), 0.1);
    }

    @Test
    public void setCustomerWallet(){
        customer.setCustomerWallet(400.0);
        assertEquals(400.0, customer.getCustomerWallet(), 0.1);
    }
}
