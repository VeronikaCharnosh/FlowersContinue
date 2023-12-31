package edu.ucu.edu.apps.item;

public class PaperDecorator extends ItemDecorator {
    private Item item;
    private int mg = 13;
    @Override
    public String getDecription() {
        return item.getDecription();
    }

    @Override
    public double getPrice() {
        return mg + item.getPrice();
    }
    
}
