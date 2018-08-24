package org.playground.atomic.sound;


import org.springframework.beans.factory.annotation.Autowired;


public class CDPlayer implements MediaPlayer {

    private CompactDisk compactDisk;

//    @Autowired
//    public CDPlayer(CompactDisk compactDisk) {
//        this.compactDisk = compactDisk;
//    }

    @Override
    public void play() {
        compactDisk.play();
    }

    public CompactDisk getCompactDisk() {
        return compactDisk;
    }

    @Autowired
    public void setCompactDisk(CompactDisk compactDisk) {
        this.compactDisk = compactDisk;
    }
}
