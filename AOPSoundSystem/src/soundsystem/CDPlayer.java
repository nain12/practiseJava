package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;

	@Autowired
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	@Override
	public void play() {
		cd.play();
	}
}
