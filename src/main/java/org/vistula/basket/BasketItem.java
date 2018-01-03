package org.vistula.basket;

public class BasketItem {

    private float price;
    private boolean ageRestrictedItem;

    public BasketItem() {

    }

    public BasketItem(float price, boolean ageRestrictedItem) {
        this.price = price;
        this.ageRestrictedItem = ageRestrictedItem;

    }
    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setAgeRestrictedItem(boolean ageRestrictedItem) {
        this.ageRestrictedItem = ageRestrictedItem;
    }

    public boolean getAgeRestrictedItem() {
        return ageRestrictedItem;
    }
    //




}
