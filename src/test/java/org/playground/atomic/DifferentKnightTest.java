package org.playground.atomic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.playground.atomic.knight.ForgottenKnight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/knight/knight_beans.xml"})
public class DifferentKnightTest {

    @Autowired
    ForgottenKnight oldKnight;

    @Test
    public void testExistence() {

        Assert.assertNotNull(oldKnight);
    }

}
