package org.playground.atomic.soundsystem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"/sound_system.xml"})
@ContextConfiguration(classes = CDConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisk cd;

    @Test
    public void bothExist() {
        Assert.assertNotNull(cd);
    }

}
