package org.playground.atomic.soundsystem;

import org.springframework.stereotype.Component;

// Component scanning isn’t turned on by default
@Component // a bean should be created for this class
public class SgtPeppers implements CompactDisk {
    @Override
    public void play() {
        System.out.println("Playing like a ....");
    }
}
