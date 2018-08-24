package org.playground.atomic;

import org.springframework.stereotype.Component;

/**
 * Created by scruz on 13/08/18.
 */
@Component
class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight(RescueDamselQuest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
