package org.example.model;

public class Bread extends ProductForSale{
    private String flourType;

    public String getFlourType() {
        return flourType;
    }

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.flourType = flourType;

    }

    @Override
    public void showDetails() {
        System.out.println("Bread: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Flour Type: " + flourType);
        System.out.println("----------------------------");
    }
}
