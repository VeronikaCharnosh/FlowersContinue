package edu.ucu.edu.apps.item;

public abstract class Item {
    private String description;

    public String getDecription() {
        return description;
    }

    public abstract double getPrice();
}