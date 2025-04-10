package org.example.model;

public class Chocolate extends  ProductForSale{
    private double cocoaPercentage;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;

    }

    public double getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa: " + cocoaPercentage + "%");
        System.out.println("----------------------------");
    }
}
