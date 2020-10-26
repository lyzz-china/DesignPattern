package com.lyz.designpattern.abstractfactory;

public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("颜色是:蓝色！");
    }
}
