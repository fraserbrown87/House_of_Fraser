import Department_Store.Shop;
import org.junit.Before;

public class ShopTest {
    Shop shop;

    @Before
    public void before(){
        shop = new Shop("House of Fraser", "145 Princes St, Edinburgh EH2 4YZ",01312252472, 6, OpeningHours);
    }
}
