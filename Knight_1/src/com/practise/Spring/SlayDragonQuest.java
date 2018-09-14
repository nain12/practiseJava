package com.practise.Spring;

import java.io.PrintStream;

interface Quest{
	void embark();
}

public class SlayDragonQuest implements Quest{

	private PrintStream stream;

	public SlayDragonQuest(PrintStream ps){
		this.stream = ps;
	}
	
	public void embark() {
	stream.println("Embarking on a Quest to slay the dragon!");
		
	}
}
