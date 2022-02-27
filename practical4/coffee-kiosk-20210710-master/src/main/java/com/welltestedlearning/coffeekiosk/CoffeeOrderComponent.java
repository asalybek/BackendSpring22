package com.welltestedlearning.coffeekiosk;

import org.springframework.stereotype.Component;

@Component
public class CoffeeOrderComponent {

    public CoffeeOrderComponent(CoffeeOrderController coffeeOrderController) {
        System.out.println();
        System.out.println(this.getClass().getName() + " has been instantiated.");
        System.out.println(" --> Was passed a reference to a dependency: " + coffeeOrderController);
        System.out.println();
    }
}
