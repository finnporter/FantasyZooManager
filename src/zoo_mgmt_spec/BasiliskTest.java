package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.animals.Basilisk;

public class BasiliskTest {
	Basilisk basilisk;

	@Before
	public void before() {
		basilisk = new Basilisk("Maude", "1923-02-23", 20, false, true, 3);
	}

	//Abstract Animal class tests are tested in Hydra.java
	//SPECIAL BASILISK TEST
	@Test
	public void howLong() {
		assertEquals(20.0, basilisk.getLength(), 0.01);
	}

	@Test
	public void isVenomous() {
		assertEquals(false, basilisk.getVenomous());
	}  

	@Test
	public void canSwim() {
		assertEquals("swoosh swoosh", basilisk.swim());
	}

	@Test
	public void canSlither() {
		assertEquals("Maude slithers menacingly on the ground.", basilisk.slither());
	}

	@Test
	public void canLookAtVictim() {
		assertEquals("Maude looks at the victim. It turns to stone.", basilisk.lookAtVictim());
	}
}