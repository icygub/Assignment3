package cs115;

/**
 * Created by icyhot on 31/05/2017.
 */
public class IceCream extends DessertItem {

    private double cost;

    public IceCream(String name, double cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public double calculateItemCost() {
        return cost;
    }
}
