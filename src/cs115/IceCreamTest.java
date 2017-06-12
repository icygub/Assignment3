package cs115;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by icyhot on 6/12/2017.
 */
public class IceCreamTest {
    @Test
    public void calculateItemCost() throws Exception {
        IceCream iceCream = new IceCream("ice cream", 1.0);
        assertEquals(1.0, iceCream.calculateItemCost(), 0);
    }

    @Test
    public void findSalesTax() throws Exception {
        IceCream iceCream = new IceCream("Ice cream", 1.0);
        assertEquals(0.1, iceCream.findSalesTax(), 0);
    }

}