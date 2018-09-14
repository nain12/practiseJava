package com.practise.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Knight obj = (Knight) context.getBean("knight");
		obj.embarkQuest();
	}

}
