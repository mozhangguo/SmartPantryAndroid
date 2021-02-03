package com.uwaterloo.smartpantry.inventory;

public class Food {

    String name = null;
    Stock stock = null;
    Category category = null;
    String expiration_date = null;

    public Food() {

    }

    public String getName() {
        return this.name;
    }

    public Stock getStock() {
        return this.stock;
    }

    public Category getCategory() {
        return this.category;
    }

    public String getExpirationDate() {
        return this.expiration_date;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

}
