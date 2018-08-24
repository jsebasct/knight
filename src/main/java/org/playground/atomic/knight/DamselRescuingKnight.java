package org.playground.atomic.knight;

import org.springframework.stereotype.Component;

/**
 * Created by scruz on 13/08/18.
 */
@Component
public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight(RescueDamselQuest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
