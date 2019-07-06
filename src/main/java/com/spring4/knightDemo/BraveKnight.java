package com.spring4.knightDemo;

public class BraveKnight implements Knight{

    private Quest quest;

    private Minstrel minstrel;

    public BraveKnight(Quest quest){
        this.quest=quest;
    }

    public BraveKnight(Quest quest,Minstrel minstrel){
        this.quest=quest;
        this.minstrel=minstrel;
    }

    public void embarkOnQuest() {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}
