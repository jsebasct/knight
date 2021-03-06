package org.playground.atomic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.playground.atomic.sound.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/sound_system.xml"})
public class ComplexXMLConfigTest {

    @Autowired
    private MediaPlayer player;

    @Test
    public void bothExist() {
        Assert.assertNotNull(player);
    }

}
