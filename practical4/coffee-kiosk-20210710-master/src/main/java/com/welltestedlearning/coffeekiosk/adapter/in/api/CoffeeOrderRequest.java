package com.welltestedlearning.coffeekiosk.adapter.in.api;

public class CoffeeOrderRequest {
    private String customerName;
    private String size;
    private String kind;
    private String creamer;

    public CoffeeOrderRequest(String customerName, String size, String kind, String creamer) {
        this.customerName = customerName;
        this.size = size;
        this.kind = kind;
        this.creamer = creamer;
    }

    public CoffeeOrderRequest() {};

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCreamer() {
        return creamer;
    }

    public void setCreamer(String creamer) {
        this.creamer = creamer;
    }

}
