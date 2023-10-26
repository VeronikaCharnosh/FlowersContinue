package edu.ucu.edu.apps.item;

public class PaperDecorator extends ItemDecorator{
    private Item item;
    @Override
    public String getDecription(){
        return item.getDecription();
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }
    
}
