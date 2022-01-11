package com.step.products;

import com.step.menu.IProduct;

public class product1 implements IProduct {
    private String productName ;
    private double productPrice ;
    private String productProducer ;


    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductProducer() {
        return productProducer;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public void setProductProducer(String productProducer) {
        this.productProducer  = productProducer;
    }

}
