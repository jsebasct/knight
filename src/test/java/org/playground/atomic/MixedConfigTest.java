package org.playground.atomic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.playground.atomic.knight.DamselRescuingKnight;
import org.playground.atomic.knight.ForgottenKnight;
import org.playground.atomic.knight.MixedMasterConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MixedMasterConfig.class})

//@ImportResource("classpath:knight_config.xml")
public class MixedConfigTest {

//    @Autowired
//    private ForgottenKnight oldKnight;

    @Autowired
    private DamselRescuingKnight damselRescuingKnight;

    @Test
    public void testExistence() {
//        Assert.assertNotNull(oldKnight);
        Assert.assertNotNull(damselRescuingKnight);
    }

}
