package sponge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KaskrouteTest {
	
	private Kaskroute kaskroute;

	@Before
	public void setUp() throws Exception {
		kaskroute = new Kaskroute();
	}

	
	
	@Test
	public void testKool1() {
		Assert.assertEquals("mabannou", kaskroute.kool("kaftegi"));
	}	

}
