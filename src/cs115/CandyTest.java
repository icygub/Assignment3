package cs115;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by icyhot on 6/12/2017.
 */
public class CandyTest {
    @Test
    public void calculateItemCost() throws Exception {
        Candy candy = new Candy("candy", 2.0, 1);
        assertEquals(2.0, candy.calculateItemCost(), 00);
    }

    @Test
    public void findSalesTax() throws Exception {
        Candy candy = new Candy("candy", 2.0, 1);
        assertEquals(0.2, candy.findSalesTax(), 0);
    }

}