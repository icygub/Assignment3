package cs115;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by icyhot on 6/12/2017.
 */
public class SundaeTest {
    @Test
    public void calculateItemCost() throws Exception {
        Sundae sundae = new Sundae("sundae", 1.00, "oreos", 1);
        assertEquals(2.00, sundae.calculateItemCost(), 0);
    }

    @Test
    public void findSalesTax() throws Exception {
        Sundae sundae = new Sundae("sundae", 1.00, "oreos", 1);
        assertEquals(0.2, sundae.findSalesTax(), 0);
    }

}