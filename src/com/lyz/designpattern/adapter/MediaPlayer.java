package com.lyz.designpattern.adapter;

//适配者：通过此接口与目标接口进行适配
public interface MediaPlayer {
    public void play(String audioType, String fileName);
}
