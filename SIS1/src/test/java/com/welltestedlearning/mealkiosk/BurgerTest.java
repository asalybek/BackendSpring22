package com.welltestedlearning.mealkiosk;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BurgerTest {

    @Test
    public void regularBurgerCosts5() throws Exception {
        Burger burger = new Burger();

        int price = burger.price();

        assertThat(price)
                .isEqualTo(5);
    }

    @Test
    public void cheeseburgerCosts6() throws Exception {
        Burger burger = new Burger();
        burger.addTopping(BurgerTopping.CHEESE);
        assertThat(burger.price())
                .isEqualTo(6);
    }

    @Test
    public void baconCheeseburgerCosts8() throws Exception {
        Burger burger = new Burger();
        burger.addTopping(BurgerTopping.CHEESE);
        burger.addTopping(BurgerTopping.BACON);

        assertThat(burger.price())
                .isEqualTo(8);
    }

    @Test
    public void doubleCheeseburgerCosts7() throws Exception {
        Burger burger = new Burger();
        burger.addTopping(BurgerTopping.CHEESE);
        burger.addTopping(BurgerTopping.CHEESE);

        assertThat(burger.price())
                .isEqualTo(7);
    }
}