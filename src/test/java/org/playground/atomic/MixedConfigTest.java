package org.playground.atomic;

import org.junit.Assert;
import org.junit.Test;
import org.playground.atomic.knight.ForgottenKnight;
import org.springframework.beans.factory.annotation.Autowired;

public class MixedConfigTest {

    @Autowired
    ForgottenKnight oldKnight;

    @Test
    public void testExistence() {
        Assert.assertNotNull(oldKnight);
    }

}
