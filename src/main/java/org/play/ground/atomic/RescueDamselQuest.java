package org.play.ground.atomic;

import org.springframework.stereotype.Component;

/**
 * Created by scruz on 06/08/18.
 */
@Component
public class RescueDamselQuest implements Quest {
    public void embark() {
        System.out.println("Estoy arrepentido embark !");
    }
}
