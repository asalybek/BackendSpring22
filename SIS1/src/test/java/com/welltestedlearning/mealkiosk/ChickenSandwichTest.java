package com.welltestedlearning.mealkiosk;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ChickenSandwichTest {

    @Test
    public void regularSandwichCosts6() throws Exception {
        ChickenSandwich chickenSandwich = new ChickenSandwich();

        assertThat(chickenSandwich.price())
                .isEqualTo(6);
    }

    @Test
    public void sandwichIsSpicy() throws Exception {
        ChickenSandwich chickenSandwich = new ChickenSandwich();

        assertThat(chickenSandwich.isSpicy())
                .isTrue();
    }

    @Test
    public void sandwichIsNotSpicy() throws Exception {
        ChickenSandwich chickenSandwich = new ChickenSandwich(false);

        assertThat(chickenSandwich.isSpicy())
                .isFalse();
    }

    @Test
    public void cheeseSandwichCosts7() throws Exception {
        ChickenSandwich chickenSandwich = new ChickenSandwich();
        chickenSandwich.addTopping(BurgerTopping.CHEESE);

        assertThat(chickenSandwich.price())
                .isEqualTo(7);
    }

}