package com.lyz.designpattern.builder;

public class Pen {
    private String name;
    private int lang;

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                ", lang=" + lang +
                '}';
    }

    public Pen(String name, int lang) {
        this.name = name;
        this.lang = lang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLang() {
        return lang;
    }

    public void setLang(int lang) {
        this.lang = lang;
    }
}
