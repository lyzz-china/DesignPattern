package com.lyz.designpattern.builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director(new BuildPartA());

        Product construct = director.construct();

        construct.Show();
    }

}
