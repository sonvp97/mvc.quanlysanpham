package com.example.product;

public class Product {
    private int id;
    private String name;
    private double price;

    private String describe;

    private String producer;

    private int quantity;

    public Product() {
    }

    public Product(int id, String name, double price, String describe, String producer, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.producer = producer;
        this.quantity = quantity;
    }

    public Product(String name, double price, String describe, String producer, int quantity) {
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.producer = producer;
        this.quantity = quantity;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
