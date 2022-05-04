package com.welltestedlearning.mealkiosk;

public class MealOrderRequest {
    private String burger;
    private String drinkSize;

    public String getBurger() {
        return this.burger;
    }

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }
}