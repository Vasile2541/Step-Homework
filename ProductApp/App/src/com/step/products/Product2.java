package com.step.products;

import com.step.menu.IProduct;

public class Product2 implements IProduct {
    private String productName ;
    private double productPrice ;
    private String productProducer ;

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public void setProductProducer(String productName) {
        this.productName  = productName;
    }
}
