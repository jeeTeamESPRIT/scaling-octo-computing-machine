package sponge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestKaskroute {
	private Kaskroute kaskroute;

	@Before
	public void setUp() throws Exception {
		kaskroute = new Kaskroute();
	}

	@Test
	public void testKool() {
		Assert.assertEquals("gerrr", kaskroute.kool("kaftegi"));
	}

}
