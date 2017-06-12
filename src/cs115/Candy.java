package cs115;

/**
 * Created by icyhot on 31/05/2017.
 */
public class Candy extends DessertItem {

    private double weight;
    private int pricePerPound;

    public Candy(String name, double weight, int pricePerPound) {
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    @Override
    public double calculateItemCost() {
        double cost = weight * pricePerPound;
        return cost;
    }

    @Override
    public double findSalesTax() {
        return calculateItemCost() * 0.1;
    }
}
