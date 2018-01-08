import Department_Store.OpeningHours;
import Department_Store.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;

    @Before
    public void before(){
        shop = new Shop("House of Fraser", "145 Princes St, Edinburgh EH2 4YZ",01312252472, 6, OpeningHours.SUNDAY);
    }


    @Test
    public void hasName() {
        assertEquals("House of Fraser", shop.getName());

    }

    @Test
    public void hasAddress(){
        assertEquals("145 Princes St, Edinburgh EH2 4YZ", shop.getAddress());
    }

    @Test
    public void hasPhoneNumber(){
        assertEquals(01312252472, shop.getPhoneNumber());
    }

}
