package com.lyz.designpattern.builder;


//产品角色
public class Product {

    private Pen pen;

    private String partA;
    private String partB;
    private String partC;

    public void Show(){
        System.out.println(partA);
        System.out.println(partB);
        System.out.println(partC);
        System.out.println(pen);
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
