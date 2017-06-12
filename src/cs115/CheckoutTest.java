package cs115;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by icyhot on 6/12/2017.
 */
public class CheckoutTest {
    @Test
    public void add() throws Exception {
        Checkout c = new Checkout();
        c.add(new Candy("candy", 1.00, 1));
        c.add(new Cookie("cookie", 6, 12));
        assertTrue(c.desserts.size() == 2);
    }


    @Test
    public void totalCost() throws Exception {
        Checkout c = new Checkout();
        Candy candy = new Candy("candy", 2.00, 1);
        Cookie cookie = new Cookie("cookie", 6, 12);
        IceCream iceCream = new IceCream("ice cream", 1.20);
        Sundae sundae = new Sundae("sundae", 1.50, "oreos", 1);
        c.add(candy);
        c.add(cookie);
        c.add(iceCream);
        c.add(sundae);
        double total = candy.calculateItemCost() + cookie.calculateItemCost() + iceCream.calculateItemCost() + sundae.calculateItemCost();
        total += candy.findSalesTax() + cookie.findSalesTax() + iceCream.findSalesTax() + sundae.findSalesTax();

        assertEquals(total, c.totalCost(),0);
    }

    @Test
    public void printReceipt() throws Exception {

    }

}