package com.spring4.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class CDPlayer implements MediaPlayer{
    private CompactDisc compactDisc;

    /**
     * @Inject 和 @Autowired 一样，有点细微的差别，但大多数情况他们可以互相替换使用
     * @param compactDisc
     */
    @Autowired
    public CDPlayer(CompactDisc compactDisc){
        this.compactDisc=compactDisc;
    }
    public void play(){
        compactDisc.play();
    }
}
