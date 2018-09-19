package concert;

import org.springframework.stereotype.Component;

@Component
public class Singing implements Performance{

	@Override
	public void perform() {
		System.out.println("Singing With or Without You by U2");	
	}

}
