package com.practise.Spring;

interface Knight{
	void embarkQuest();
}
public class BraveKnight implements Knight {

	private Quest quest;
	
	public BraveKnight(Quest quest){
		this.quest = quest;
	}
	
	public void embarkQuest() {
	quest.embark();
	}
}