package com.welltestedlearning.coffeekiosk.adapter.in.api;

import com.welltestedlearning.coffeekiosk.domain.CoffeeItem;
import com.welltestedlearning.coffeekiosk.domain.CoffeeOrder;
import com.welltestedlearning.coffeekiosk.domain.CoffeeOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@RestController
public class CoffeeOrderController {

    @Value("${order.price.currency.prefix}")
    private String currencyPrefix;

    @Autowired
    private final CoffeeOrderRepository coffeeOrderRepository;

    public CoffeeOrderController(CoffeeOrderRepository coffeeOrderRepository) {
        this.coffeeOrderRepository = coffeeOrderRepository;
    }

    @GetMapping(value = "/api/coffee/order", produces = MediaType.APPLICATION_JSON_VALUE)
    public CoffeeItemResponse getCoffeeItem() {
        CoffeeItem coffeeItem = new CoffeeItem("small", "latte", "milk");
        coffeeItem.setId(1L);
        return CoffeeItemResponse.from(coffeeItem);
    }

    @GetMapping("/api/coffee/orders/{id}")
    public ResponseEntity<CoffeeOrderResponse> coffeeOrder(@PathVariable("id") long orderId) {
        CoffeeItem coffeeItem = new CoffeeItem("small", "latte", "milk");
        coffeeItem.setId(99L);
        CoffeeOrder coffeeOrder = coffeeOrderRepository.findById(orderId).get();
        CoffeeOrderResponse response = CoffeeOrderResponse.from(coffeeOrder, currencyPrefix);
        Optional<CoffeeOrder> opt = Optional.ofNullable(coffeeOrder);
        if(opt.isPresent()) {
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/api/coffee/orders")
    public ResponseEntity createCoffeeOrder(@RequestBody CoffeeOrderRequest coffeeOrderRequest){
        CoffeeItem coffeeItem = new CoffeeItem(coffeeOrderRequest.getSize(), coffeeOrderRequest.getKind(), coffeeOrderRequest.getCreamer());
        coffeeItem.setId(22L);
        CoffeeOrder coffeeOrder = new CoffeeOrder(coffeeOrderRequest.getCustomerName(), LocalDateTime.now());
        coffeeOrder.add(coffeeItem);
        CoffeeOrder savedCoffeeOrder = coffeeOrderRepository.save(coffeeOrder);
        return ResponseEntity.created(URI.create("/api/coffee/orders/" + savedCoffeeOrder.getId())).build();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void handleIllegalArgumentAsBadRequest() {
    }

}
