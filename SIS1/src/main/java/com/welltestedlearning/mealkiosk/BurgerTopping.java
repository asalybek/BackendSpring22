package com.welltestedlearning.mealkiosk;

public enum BurgerTopping {
    BACON(2),
    CHEESE(1),
    AVOCADO(3),
    SPICY(6);

    private final int code;

    BurgerTopping(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}


