import Department_Store.OpeningHours;
import Department_Store.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;

    @Before
    public void before(){
        shop = new Shop("House of Fraser", "145 Princes St, Edinburgh EH2 4YZ",01312252472, 6, OpeningHours.MONDAY);
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

    @Test
    public void hasFloorNumber(){
        assertEquals(6, shop.getFloorQuantity());
    }

    @Test
    public void hasOpeningDay(){
        assertEquals(OpeningHours.MONDAY, shop.getOpeningDay());
    }

    @Test
    public void hasOpeningTime(){
        OpeningHours openingDay = shop.getOpeningDay();
        assertEquals(900, openingDay.getOpeningTime());
    }

    @Test
    public void hasClosingTime(){
        OpeningHours openingDay = shop.getOpeningDay();
        assertEquals(1800, openingDay.getClosingTime());
    }

    @Test
    public void getAllOpeningDays(){
        OpeningHours[] expected = {OpeningHours.MONDAY, OpeningHours.TUESDAY, OpeningHours.WEDNESDAY, OpeningHours.THURSDAY, OpeningHours.FRIDAY, OpeningHours.SATURDAY, OpeningHours.SUNDAY};
        OpeningHours[] days = OpeningHours.values();
        assertEquals(7, days.length);
        assertEquals(expected, days);
    }

    @Test
    public void shopDepartmentStartsEmpty(){
        assertEquals(0, shop.getDepartmentcount());
    }


}
