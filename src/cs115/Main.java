package cs115;

/**
 * Group: John Diaz and Jordan Wells
 * CS 115
 * Assignment 3: Inheritance and polymorphism
 * Brother Masterson
 */

public class Main {

    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        checkout.add(new IceCream("Strawberry Ice Cream",145));
        checkout.add(new Sundae("Vanilla Ice Cream",105, "Caramel", 50));
        checkout.add(new Candy("Gummy Worms", 1.33, 89));
        checkout.add(new Cookie("Chocolate Chip Cookies", 4, 399));
        checkout.add(new Candy("Salt Water Taffy", 1.5, 209));
        checkout.add(new Candy("Candy Corn",3.0, 109));

        checkout.printReceipt();
    }
}
