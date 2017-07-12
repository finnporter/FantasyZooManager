package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.animals.Hippogriff;

public class HippogriffTest {
	Hippogriff hippogriff;

	@Before
	public void before() {
		hippogriff = new Hippogriff("Buckbeak", "2002-07-12", "light grey", true, 2);
	}

	//Abstract animal class tests are tested in Hydra.java
	//SPECIAL HIPPOGRIFF TESTS
	@Test
	public void hasColour() {
		assertEquals("light grey", hippogriff.getColour());
	}

	@Test
	public void canFly() {
		assertEquals("fwoomp fwoomp", hippogriff.fly());
	}

	@Test
	public void canPeck() {
		assertEquals("peck peck", hippogriff.peck());
	}

	@Test
	public void canScreech() {
		assertEquals("Buckbeak screeches loudly.", hippogriff.screech());
	}
}