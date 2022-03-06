package com.welltestedlearning.mealkiosk;

import java.util.ArrayList;
import java.util.List;

public class MealOrder {
    private List<MenuItem> items = new ArrayList<>();

    public static MealOrder createBurgerOnlyOrder(BurgerTopping burgerOption) {
        return new MealOrder(burgerOption);
    }

    public static void main(String[] args) {
        MealOrder drinkOrder = new MealOrder();
        drinkOrder.addDrink(Drink.DRINK_LARGE);
        drinkOrder.display();

        MealOrder burgerOrder = createBurgerOnlyOrder(null);
        burgerOrder.display();
    }

    public MealOrder() {
    }

    public MealOrder(BurgerTopping burgerOption) {
        addBurger(burgerOption);
    }

    public void addDrink(String drinkSize) {
        items.add(new Drink(drinkSize));
    }

    public void addFries(String friesSize) {
        items.add(new Fries(friesSize));
    }

    public void addBurger(BurgerTopping burgerOption) {
        items.add(new Burger(burgerOption));
    }

    public MealOrder(BurgerTopping burger,
                     DrinkOption drink) {
        addBurger(burger);
        addDrink(drink.name().toLowerCase());
    }

    public int price() {
        // loop over all items and sum their price
        int price = 0;
        for (MenuItem item : items) {
            price = price + item.price();
        }
        return price;
    }

    public void display() {
        for (MenuItem item : items) {
            item.display();
        }
        System.out.println("Price: " + price() + "\n");
    }

    public void addItem(MenuItem menuItem) {
        items.add(menuItem);
    }
}

