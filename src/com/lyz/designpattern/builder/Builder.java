package com.lyz.designpattern.builder;

public abstract class Builder {

    public Product product = new Product();

    public abstract void buildpartA();

    public abstract void buildpartB();

    public abstract void buildpartC();

    public abstract void builePen();

    public Product getResult() {
        return product;
    }
}
