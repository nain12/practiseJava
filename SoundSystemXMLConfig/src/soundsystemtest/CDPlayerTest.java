package soundsystemtest;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/soundsystem/Bean.xml"})
public class CDPlayerTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Autowired
	private MediaPlayer player;

	@Autowired
	private CompactDisc cd;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}

	@Test
	public void play() {
		player.play();
		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\r\n"
				+ "Tracks: Sgt. Pepper's Lonely Hearts Club Band\r\n"
				+ "Tracks: With a Little Help from My Friends\r\n"
				+ "Tracks: Lucy in the Sky with Diamonds\r\n"
				+ "Tracks: Getting Better\r\n"
				+ "Tracks: Fixing a Hole\r\n", systemOutRule.getLog());
	}
}
