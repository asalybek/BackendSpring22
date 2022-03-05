package com.welltestedlearning.mealkiosk;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MealOrderTest {

    @Test
    public void emptyMealIsZeroPrice() throws Exception {
        MealOrder mealOrder = new MealOrder();

        assertThat(mealOrder.price())
                .isZero();
    }

    @Test
    public void mealWithCheeseBurgerIs1() throws Exception {
        MealOrder mealOrder = new MealOrder(BurgerTopping.CHEESE);

        assertThat(mealOrder.price())
                .isEqualTo(1);
    }

    @Test
    public void mealWithRegularBurgerLargeDrinkCosts7() throws Exception {
        MealOrder mealOrder = new MealOrder(null, DrinkOption.LARGE);

        assertThat(mealOrder.price())
                .isEqualTo(7);
    }

}
