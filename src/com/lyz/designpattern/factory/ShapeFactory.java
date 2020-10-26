package com.lyz.designpattern.factory;

public class ShapeFactory {

    public Shape getShape(String type) {
        if(type == null) {
            return null;
        }
        if("Circle".equals(type)) {
            return new Circle();

        } else if("Square".equals(type)) {
            return new Square();
        }
        return null;
    }

}
