package edu.ucu.edu.apps.item;

import java.util.ArrayList;
import java.util.List;

public class CactusFlower extends Item{

   
    
        private List<FlowerPack> flowerPacks = new ArrayList<>();
        public double getPrice() {
            double price = 0;
            for (FlowerPack flowerPack: flowerPacks) {
                price += flowerPack.getPrice();
            }
            return price;
        }
    }
    

