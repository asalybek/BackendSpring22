package com.welltestedlearning.coffeekiosk;

public class CoffeeItemResponse {
    private Long id;
    private String size;
    private String kind;
    private String creamer;
    private int price;

    public CoffeeItemResponse(Long id, String size, String kind, String creamer, int price) {
        this.id = id;
        this.size = size;
        this.kind = kind;
        this.creamer = creamer;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    static CoffeeItemResponse from(CoffeeItem item) {
        return new CoffeeItemResponse(item.getId(), item.size(), item.kind(), item.creamer(), item.price());
    }
}
