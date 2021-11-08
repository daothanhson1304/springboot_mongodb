package com.example.spring_mongo.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Products {
    @Id
    private long _id;
    private String title;
    private String image;
    private boolean inStock;
    private String type_product;
    private Double reguler_price;
    private Double sale_price;
    private Double last_price;

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getType_product() {
        return type_product;
    }

    public void setType_product(String type_product) {
        this.type_product = type_product;
    }

    public Double getReguler_price() {
        return reguler_price;
    }

    public void setReguler_price(Double reguler_price) {
        this.reguler_price = reguler_price;
    }

    public Double getSale_price() {
        return sale_price;
    }

    public void setSale_price(Double sale_price) {
        this.sale_price = sale_price;
    }

    public Double getLast_price() {
        return last_price;
    }

    public void setLast_price(Double last_price) {
        this.last_price = last_price;
    }

    public Products(String title, String image, boolean inStock, String type_product, Double reguler_price, Double sale_price, Double last_price) {
        super();
        this.title = title;
        this.image = image;
        this.inStock = inStock;
        this.type_product = type_product;
        this.reguler_price = reguler_price;
        this.sale_price = sale_price;
        this.last_price = last_price;
    }

    public Products(){
        super();
    }
}
