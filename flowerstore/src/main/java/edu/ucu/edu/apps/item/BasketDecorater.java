package edu.ucu.edu.apps.item;

public class BasketDecorater extends ItemDecorator {
    private Item item;
    @Override
    public String getDecription() {
        return item.getDecription();
    }

    
    private int mg = 4;
    public double getPrice() {
        return mg + item.getPrice();
    }
    
}
