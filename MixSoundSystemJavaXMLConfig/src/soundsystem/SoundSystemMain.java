package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SoundSystemMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		CompactDisc cd = (CompactDisc) context.getBean("blankDisc");
		cd.play();
	}

}
