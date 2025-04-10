package org.example.model;

public class Coke extends ProductForSale{
    private boolean isDiet;

    public boolean isDiet() {
        return isDiet;
    }

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.isDiet = isDiet;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Diet: " + (isDiet ? "Yes" : "No"));
        System.out.println("----------------------------");
    }
}
