package edu.ucu.edu.apps.item;

public class BasketDecorater extends ItemDecorator {
    private Item item;
    private int mg;
    @Override
    public String getDecription() {
        return item.getDecription();
    }

    public double getPrice() {
        return mg + item.getPrice();
    }
    
}
