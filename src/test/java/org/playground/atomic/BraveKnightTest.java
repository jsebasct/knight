package org.playground.atomic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.playground.atomic.config.KnightConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

/**
 * Created by scruz on 06/08/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = KnightConfig.class)
public class BraveKnightTest {

    @Autowired
    private DamselRescuingKnight knight;

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

    @Test
    public void existence() {
        assertNotNull(knight);
    }
}
