package com.practise.Spring;

import java.io.PrintStream;

public class Minstrel {

	PrintStream stream;
	
	public Minstrel(PrintStream stream){
		this.stream = stream;
	}
	
	public void singBeforeQuest() {
		stream.println("Fa la la, the knight is so brave!");
	}

	public void singAfterQuest() {
		stream.println("Tee hee hee, the brave knight "
				+ "did embark on a quest!");
	}

}
