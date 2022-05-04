package com.welltestedlearning.mealkiosk;

import com.welltestedlearning.mealkiosk.adapter.MealBuilder;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealOrderApiController {

    @PostMapping(value = "/api/mealorder", consumes = MediaType.APPLICATION_JSON_VALUE)
    public MealOrderResponse mealOrder(@RequestBody MealOrderRequest mealOrderRequest) {
        String orderRequest = mealOrderRequest.getBurger();

        MealBuilder mealBuilder = new MealBuilder();
        mealBuilder.burger(orderRequest);
        MealOrder mealOrder = mealBuilder.build();

        int price = mealOrder.price();

        MealOrderResponse mealOrderResponse = new MealOrderResponse();
        mealOrderResponse.setPrice(price);

        return mealOrderResponse;
    }
}
