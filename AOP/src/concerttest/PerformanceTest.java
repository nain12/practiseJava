package concerttest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import concert.ConcertConfig;
import concert.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class )
public class PerformanceTest {

	@Autowired
	Performance p;
	@Test
	public void performanceSinging(){
		assertNotNull(p);
		p.perform();
	}
}
