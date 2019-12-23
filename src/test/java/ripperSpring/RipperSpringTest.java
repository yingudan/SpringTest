package ripperSpring;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ripper.ComponentDemo.CDplayerConfig;
import com.ripper.ComponentDemo.CompactDisc;
import com.ripper.ComponentDemo.SgtPeppers2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDplayerConfig.class)
public class RipperSpringTest {

//	@Resource(name="wemz")
//	@Autowired
//	@Qualifier("wemz")
//	@Resource(type=SgtPeppers2.class)
	private CompactDisc compactDisc;
	
	
//	@Test
//	public void cdshow() {
//		compactDisc.play();
//
//	}

	@Test
	public void getCompactDiscName() {
		compactDisc.getName();

	}

}
