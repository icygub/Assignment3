package cs115;

/**
 * Created by icyhot on 31/05/2017.
 */
public abstract class DessertItem {

    private String name;

    public DessertItem(String name) {
        this.name = name;
    }

    public abstract double calculateItemCost();

    public double findSalesTax() {
        return calculateItemCost() * 0.1;
    };

    public String getName() {
        return name;
    }
}
