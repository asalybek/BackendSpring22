package com.welltestedlearning.mealkiosk;

public class Burger implements MenuItem {

    private Toppings burgerToppingsList;

    public Burger(BurgerTopping theBurgerOption) {
        burgerToppingsList = new Toppings();
        burgerToppingsList.add(theBurgerOption);
    }

    public Burger() {
        burgerToppingsList = new Toppings();
        burgerToppingsList.add(null);
    }

    @Override
    public int price() {
        return burgerToppingsList.price();
    }

    public void display() {
        System.out.println("Burger: " + burgerToppingsList.toString());
    }

    public void addTopping(BurgerTopping topping) {
        burgerToppingsList.add(topping);
    }

    @Override
    public String toString() {
        return "Burger {" +
                "burgerOption=" + burgerToppingsList.toString() +
                '}';
    }
}
