package com.learning.procuct_mangaement_using_SpringJPA.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "productDetails")
//This annotation will create table with mentioned name o.w it will create className in lowercase (eg:  product)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Id automatically update
    int productId; //In table : product_id
    @Column(name = "product")
    String productName; //In table : product
    Double productPrice; //In table : product_price
    @Column(name="manufacturing_date")
    LocalDate date ;  //In table : manufacturing_date

    public Product() {
        System.out.println("Product Bean created");
    }

    public Product( String productName, Double productPrice, LocalDate date) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.date = date;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Project{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", date=" + date +
                '}';
    }
}
