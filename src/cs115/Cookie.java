package cs115;

/**
 * Created by icyhot on 31/05/2017.
 */
public class Cookie extends DessertItem {

    private int number;
    private int pricePerDozen;

    public Cookie(String name, int number, int pricePerDozen) {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }


    @Override
    public double calculateItemCost() {
        double pricePerCookie = pricePerDozen / 12;
        return number * pricePerCookie;
    }
}
