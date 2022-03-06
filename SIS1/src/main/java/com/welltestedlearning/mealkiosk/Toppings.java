package com.welltestedlearning.mealkiosk;

import java.util.ArrayList;
import java.util.List;

public class Toppings implements MenuItem {
    private List<BurgerTopping> toppingsList;

    public Toppings() {
        toppingsList = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println(toppingsList.toString());
    }

    public void add(BurgerTopping topping) {
        toppingsList.add(topping);
    }

    @Override
    public int price() {
        if (toppingsList.isEmpty()) return 0;
        int sum = 0;
        for (BurgerTopping burgerTopping : toppingsList) {
            if (burgerTopping != null) {
                sum += burgerTopping.code();
            } else sum += 5;
        }
        return sum;
    }
}
