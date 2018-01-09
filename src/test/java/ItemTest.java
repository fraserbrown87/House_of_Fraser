import Department_Store.Items.Brands;
import Department_Store.Items.Item;
import Department_Store.Items.ItemSpec;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    ItemSpec itemSpec;
    Item item;

    @Before
    public void before(){
        itemSpec = new ItemSpec(Brands.FRED_PERRY, "Shirt");
        item = new Item(itemSpec, 100, 50, 10);
    }
//
//    @Test
//    public void hasBrandName(){
//        assertEquals(Brands.FRED_PERRY, item.getBrandName);
//    }
}
