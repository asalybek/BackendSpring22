package com.welltestedlearning.mealkiosk;

public class ChickenSandwich implements MenuItem {

    private Toppings sandwichToppingsList;
    private Boolean isSpicy;

    public ChickenSandwich(BurgerTopping theSandwichOption) {
        sandwichToppingsList = new Toppings();
        sandwichToppingsList.add(theSandwichOption);
    }

    public ChickenSandwich() {
        this.isSpicy = true;
        sandwichToppingsList = new Toppings();
        sandwichToppingsList.add(BurgerTopping.SPICY);
    }

    public ChickenSandwich(Boolean isSpicy) {
        this.isSpicy = isSpicy;
        sandwichToppingsList = new Toppings();
        sandwichToppingsList.add(BurgerTopping.SPICY);
    }

    public Boolean isSpicy() {
        return isSpicy;
    }

    @Override
    public int price() {
        return sandwichToppingsList.price();
    }

    public void display() {
        System.out.println("ChickenSandwich: " + sandwichToppingsList.toString());
    }

    public void addTopping(BurgerTopping topping) {
        sandwichToppingsList.add(topping);
    }

    @Override
    public String toString() {
        return "ChickenSandwich {" +
                "burgerOption=" + sandwichToppingsList.toString() +
                '}';
    }


}
