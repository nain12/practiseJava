package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

	@Bean(name = "lonelyHeartsClubBand")
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
	
	//Method 1
	@Bean
	public CDPlayer cdPlayer(){
		return new CDPlayer(sgtPeppers());
	}
	
	//Method 2  - Constuctor injection
	public CDPlayer cdPlayer(CompactDisc cd){
		return new CDPlayer(cd);
	}
	
	//Method 3 - Setter injection
	public CDPlayer CDPlayer(CompactDisc cd){
		CDPlayer cdp = new CDPlayer(cd);
		cdp.setCd(cd);
		return cdp;
		
	}
}
