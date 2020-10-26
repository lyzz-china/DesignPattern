package com.lyz.designpattern.factory;

public class FactoryPatternTest {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("Circle");

        circle.draw();
    }

}
