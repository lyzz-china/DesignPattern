package com.lyz.designpattern.abstractfactory;

import com.lyz.designpattern.abstractfactory.Circle;
import com.lyz.designpattern.abstractfactory.Square;

public class ShapeFactory extends abstractFactory{

    @Override
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

    @Override
    public Color getColor(String type) {
        return null;
    }
}
