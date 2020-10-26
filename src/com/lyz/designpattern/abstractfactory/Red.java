package com.lyz.designpattern.abstractfactory;

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("颜色是:红色！");
    }
}
