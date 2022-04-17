package com.welltestedlearning.mealkiosk.adapter;

import com.welltestedlearning.mealkiosk.Burger;
import com.welltestedlearning.mealkiosk.BurgerTopping;
import com.welltestedlearning.mealkiosk.MealOrder;
import com.welltestedlearning.mealkiosk.Toppings;

public class MealBuilder {

    private String burgerOrder;
    private String drinkSize;
    private String friesSize;

    // factory method for the builder pattern
    public static MealBuilder builder() {
        return new MealBuilder();
    }

    // return the same instance to allow for chained/fluent method calls
    public MealBuilder burger(String burgerOrderString) {
        burgerOrder = burgerOrderString;
        return this;
    }

    public MealBuilder drink(String size) {
        drinkSize = size;
        return this;
    }

    public MealBuilder fries(String fries) {
        friesSize = fries;
        return this;
    }

    private static BurgerTopping parseTopping(String toppingString) {
        return BurgerTopping.valueOf(toppingString.toUpperCase());
    }
    public MealOrder build() {
        Toppings toppings = parseToppings(burgerOrder);

        Burger burger = new Burger();
        burger.setBurgerToppingsList(toppings);

        MealOrder mealOrder = new MealOrder();
        mealOrder.addItem(burger);

        if (drinkSize != null) {
            mealOrder.addDrink(drinkSize);
        }

        if (friesSize != null) {
            mealOrder.addFries(friesSize);
        }

        return mealOrder;
    }
    public static Toppings parseToppings(String order) {
        order = order.trim();

        Toppings toppings = new Toppings();

        String[] toppingArray = order.split(",");

        for (String s : toppingArray) {
            String toppingString = s.trim();
            if (!toppingString.equals("none")) {
                BurgerTopping burgerTopping = parseTopping(toppingString);
                toppings.add(burgerTopping);
            }
        }

        return toppings;
    }

    public void addBurgerString(String burgerOrderText) {
        this.burgerOrder += burgerOrderText;
    }


}
