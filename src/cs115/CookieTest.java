package cs115;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by icyhot on 6/12/2017.
 */
public class CookieTest {
    @Test
    public void calculateItemCost() throws Exception {
        Cookie c = new Cookie("cookie", 6, 12);
        double price = 6.0;
        assertEquals(price, c.calculateItemCost(), 0.0);
    }

    @Test
    public void findSalesTax() throws Exception {
        Cookie c = new Cookie("cookie", 6, 12);
        double tax = c.calculateItemCost() * .1;
        assertEquals(tax, c.findSalesTax(), 0.0);


    }

}