package com.welltestedlearning.coffeekiosk.domain;

import java.math.BigDecimal;

public class ConvertedCurrency {

    private String currency;
    private BigDecimal convertedAmount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(BigDecimal convertedAmount) {
        this.convertedAmount = convertedAmount;
    }
}
