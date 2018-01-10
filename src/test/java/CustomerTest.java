import Customer.Customer;
import Department_Store.Items.Item;
import Department_Store.Items.ItemSpec;
import Department_Store.Department;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Item item;
    ItemSpec itemSpec;

    @Before
    public void before(){
        customer = new Customer("John Doe", 300.0);
        item = new Item(itemSpec, 100.0, 50.0, 10);
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

    @Test
    public void customersBasketStartsEmpty(){
        assertEquals(0, customer.getBasketItemCount());
    }

    @Test
    public void canAddItemToBasket(){
        customer.addItemToBasket(item);
        assertEquals(1, customer.getBasketItemCount());
    }

    @Test
    public void canRemoveItemFromBasket(){
        customer.addItemToBasket(item);
        assertEquals(1, customer.getBasketItemCount());
        customer.removeItemFromBasket(item);
        assertEquals(0, customer.getBasketItemCount());
    }

    @Test
    public void canBuyItem(){
//        add item to basket
        customer.addItemToBasket(item);
//        find price of item
        customer.buyItem(item);
        assertEquals(200.0, customer.getCustomerWallet(),0.1);

    }

}
