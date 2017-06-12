package cs115;


/**
 * Created by icyhot on 31/05/2017.
 */
public class Sundae extends IceCream{

    private String topping;
    private int costOfTopping;

    public Sundae(String name, double cost, String topping, int costOfTopping) {
        super(name, cost);
        this.topping = topping;
        this.costOfTopping = costOfTopping;
    }

    @Override
    public double calculateItemCost() {
        return super.calculateItemCost() + costOfTopping;
    }

    @Override
    public double findSalesTax() {
        return calculateItemCost() * 0.1;
    }
}
