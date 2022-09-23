package com.reactive.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int productid;

    private String name;

    private int quantity;

    private String category;

    private double originalprice;

    private double discount;

    public Product() {

    }

    public Product(String name, int quantity, String category, double originalprice, double discount) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.originalprice = originalprice;
        this.discount = discount;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(double originalprice) {
        this.originalprice = originalprice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product [name=" + name +  ", quantity=" + quantity + ", category=" + category
                + ", original_price=" + originalprice + ", discount=" + discount + "]";
    }

}

