package com.lyz.designpattern.builder;

public class BuildPartA extends Builder{

    @Override
    public void buildpartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildpartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildpartC() {
        product.setPartC("建造 PartC");
    }

    @Override
    public void builePen() {
        product.setPen(new Pen("zk",13));
    }
}
