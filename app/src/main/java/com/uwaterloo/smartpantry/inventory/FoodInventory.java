package com.uwaterloo.smartpantry.inventory;

import java.util.HashMap;
import java.util.Map;

public class FoodInventory {
    private Map<String, Food> inventoryMap;

    FoodInventory() {

        this.inventoryMap = new HashMap<>();
    }

    public void addFoodMap(Food food) {
        if (inventoryMap.containsKey(food.getName())) {
            Food inventoryFood = inventoryMap.get(food.getName());
            inventoryFood.stock.setNumber(inventoryFood.getStock().getNumber() + food.getStock().getNumber());
            inventoryMap.put(food.getName(), inventoryFood);
        } else {
            inventoryMap.put(food.getName(), food);
        }
    }

    public void removeFromFoodMap(Food food) {
        inventoryMap.remove(food.getName());
    }

    public Map<String, Food> returnInventoryMap() {
        return inventoryMap;
    }
}
