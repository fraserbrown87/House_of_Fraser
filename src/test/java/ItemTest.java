import Department_Store.Items.Brands;
import Department_Store.Items.Item;
import Department_Store.Items.ItemSpec;
import Department_Store.OpeningHours;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ItemTest {

    ItemSpec itemSpec;
    Item item;

    @Before
    public void before(){
        itemSpec = new ItemSpec(Brands.FRED_PERRY, "Shirt");
        item = new Item(itemSpec, 100.0, 50.0, 10);
    }

    @Test
    public void hasItemSpec(){
        assertEquals(itemSpec, item.getItemSpec());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(100.0, item.getSellPrice(), 0.1);
    }

    @Test
    public void setSellPrice(){
        item.setSellPrice(150.0);
        assertEquals(150.0, item.getSellPrice(),0.1);
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(50.0, item.getBuyPrice(),0.1);
    }

    @Test
    public void setBuyPrice(){
        item.setBuyPrice(75.0);
        assertEquals(75.0, item.getBuyPrice(),0.1);
    }

    @Test
    public void hasStockLevel(){
        assertEquals(10, item.getStockLevel());
    }

    @Test
    public void setStockLevel(){
        item.setStockLevel(25);
        assertEquals(25, item.getStockLevel());
    }

    @Test
    public void hasBrandName(){
        assertEquals(Brands.FRED_PERRY, itemSpec.getBrandName());
    }

    @Test
    public void hasCategoryName(){
        Brands brands = itemSpec.getBrandName();
        assertEquals("Menswear", brands.getCategoryName());
    }

    @Test
    public void hasProductName(){
        assertEquals("Shirt", itemSpec.getProductName());
    }

    @Test
    public void setProductName(){
        itemSpec.setProductName("Polo shirt");
        assertEquals("Polo shirt", itemSpec.getProductName());
    }

    @Test
    public void getAllBrands(){
        Brands[] expected = {Brands.FRED_PERRY, Brands.RALPH_LAUREN, Brands.WAREHOUSE, Brands.DKNY, Brands.VANS, Brands.UGG, Brands.CLINIQUE, Brands.DIOR};
        Brands[] name = Brands.values();
        assertEquals(8, name.length);
        assertEquals(expected, name);

    }
}
