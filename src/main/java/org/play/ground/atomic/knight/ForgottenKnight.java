package org.play.ground.atomic.knight;

import org.play.ground.atomic.Knight;

public class ForgottenKnight implements Knight {
    @Override
    public void embarkOnQuest() {
        System.out.println("Old quest from Java 1.5 old days! ");
    }
}
