package com.lyz.designpattern.factory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画出一个Circle！");
    }
}
