package com.lyz.designpattern.abstractfactory;

public class FactoryProducer {

    public static abstractFactory getFactory(String choice) {
        if ("Shape".equals(choice)) {
            return new ShapeFactory();
        } else if ("Color".equals(choice)) {
            return new ColorFactory();
        }
        return null;
    }

}
