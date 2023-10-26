package edu.ucu.edu.apps.item;

public class BasketDecorater extends ItemDecorator{
    private Item item;
    @Override
    public String getDecription(){
        return item.getDecription();
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }
    
}
