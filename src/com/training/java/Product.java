package com.training.java;

class Product {
    private String id;
    private String name;
    private String category;
    private double price;
    private int quantity;

    public Product(String id, String name, String category, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public double getStockValue() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Category: %s, Price: %.2f, Qty: %d",
                id, name, category, price, quantity);
    }
}
