package com.lyz.designpattern.abstractfactory;

public class ColorFactory extends abstractFactory {

    @Override
    public Shape getShape(String type) {
        return null;
    }

    @Override
    public Color getColor(String type) {
        if (type == null ) {
            return null;
        }
        if ("Red".equals(type)) {
            return new Red();
        } else if ("Blue".equals(type)) {
            return new Blue();
        }
        return null;
    }
}
