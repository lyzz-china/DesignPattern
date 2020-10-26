package com.lyz.designpattern.factory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画出一个Square！");
    }
}
