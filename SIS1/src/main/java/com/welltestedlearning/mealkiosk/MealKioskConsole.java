package com.welltestedlearning.mealkiosk;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MealKioskConsole {

    public static void main(String[] args) {
        while (true) {
            System.out.println("What toppings do you want on your Burger? none, cheese, bacon, avocado");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            System.out.println("What drink size do you want ? regular, large");
            Scanner scanner2 = new Scanner(System.in);
            String input2 = scanner2.nextLine();

            MealOrder order = new MealOrder();
            order.addItem(getTopping(input.toLowerCase()));
            order.addItem(new Drink(getDrink(input2.toLowerCase())));
            order.display();
        }
    }

    private static String getDrink(String input) {
        if (input.equals("regular")) {
            return Drink.DRINK_REGULAR;
        }
        return Drink.DRINK_LARGE;
    }

    private static Burger getTopping(String input) {
        Toppings toppings = new Toppings();
        Burger burger = new Burger();
        List<String> inputs = Arrays.asList(input.split(", "));
        List<String> uniqueInputs = inputs.stream().distinct().collect(Collectors.toList());
        for (String item : uniqueInputs) {
            switch (item) {
                case "none":
                    toppings.add(null);
                    break;
                case "cheese":
                    toppings.add(BurgerTopping.CHEESE);
                    break;
                case "bacon":
                    toppings.add(BurgerTopping.BACON);
                    break;
                case "avocado":
                    toppings.add(BurgerTopping.AVOCADO);
                    break;
            }
        }
        burger.setBurgerToppingsList(toppings);
        return burger;
    }
}
