package com.welltestedlearning.mealkiosk;

import com.welltestedlearning.mealkiosk.adapter.MealBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealOrderApiController {

    @GetMapping("/api/mealorder")
    public String mealOrder(@RequestParam("burger") String burgerOrderText) {

        MealBuilder mealBuilder = new MealBuilder();
        mealBuilder.addBurgerString(burgerOrderText);
        MealOrder mealOrder = mealBuilder.build();
        return "Your order: " + mealOrder;
    }
}
