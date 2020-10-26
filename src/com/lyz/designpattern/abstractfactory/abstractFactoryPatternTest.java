package com.lyz.designpattern.abstractfactory;

public class abstractFactoryPatternTest {

    public static void main(String[] args) {
        abstractFactory abstractFactory = FactoryProducer.getFactory("Shape");

        Shape circle = abstractFactory.getShape("Circle");
        circle.draw();

        abstractFactory = FactoryProducer.getFactory("Color");
        Color red = abstractFactory.getColor("Blue");
        red.fill();

    }

}
