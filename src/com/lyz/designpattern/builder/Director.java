package com.lyz.designpattern.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildpartA();
        builder.buildpartB();
        builder.buildpartC();
        builder.builePen();
        return builder.getResult();
    }
}
