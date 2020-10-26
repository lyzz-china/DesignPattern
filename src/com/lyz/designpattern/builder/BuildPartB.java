package com.lyz.designpattern.builder;

public class BuildPartB extends Builder{
    @Override
    public void buildpartA() {
        product.setPartA("我是A");
    }

    @Override
    public void buildpartB() {
        product.setPartB("我是B");
    }

    @Override
    public void buildpartC() {
        product.setPartC("我是C");
    }

    @Override
    public void builePen() {
        product.setPen(new Pen("晨光",10));
    }
}
