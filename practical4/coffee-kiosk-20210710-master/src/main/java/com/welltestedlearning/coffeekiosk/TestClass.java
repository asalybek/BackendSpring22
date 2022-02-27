package com.welltestedlearning.coffeekiosk;

import org.springframework.beans.factory.annotation.Autowired;

public class TestClass {

    @Autowired
    public TestClass(CoffeeOrderComponent component){
        System.out.println();
        System.out.println(this.getClass().getName() + " has been instantiated. ");
        System.out.println(" --> Was passed a reference to two dependencies: " + component);
    }
}
