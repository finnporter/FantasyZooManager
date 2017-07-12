package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.animals.Unicorn;

public class UnicornTest {
	Unicorn unicorn;

	@Before
	public void before() {
		unicorn = new Unicorn("Sparkles", "1999-02-02", "purple", 8, 35, true, 8);
	}

	//Generic Animal Tests are tested in Hydra.java
	//SPECIAL UNICORN TESTS
	@Test
	public void hasHairColour() {
		assertEquals("purple", unicorn.getHairColour());
	}

	@Test
	public void hasGlamFactor() {
		assertEquals(8, unicorn.getGlamFactor());
	}

	@Test
	public void hasHornLength() {
		assertEquals(35, unicorn.getHornLength());
	}

	@Test
	public void canGlitter() {
		assertEquals("Sparkles glitters brighter than the sun.", unicorn.glitter());
	}
}