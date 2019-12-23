package ripperSpring;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ripper.ComponentDemo.CDplayerConfig;
import com.ripper.ComponentDemo.CompactDisc;
import com.ripper.ComponentDemo.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(classes = CDplayerConfig.class)
public class CDplayerTest {
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();

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
		assertEquals("playing 唱片标题" + "the song", log.getLog());
	}
}
