package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import zoo_mgmt.animals.Thestral;

public class ThestralTest {
	Thestral thestral;
	Thestral thestral2;

	@Before
	public void before() {
		thestral = new Thestral("Pontius", "1995-11-30", true, true, 10);
		thestral2 = new Thestral("Pilatus", "1995-11-30", false, true, 10);
	}

	//Generic Animal Tests are tested in Hydra.java
	//SPECIAL THESTRAL TESTS
	@Test
	public void isTrainedForPullingCarriage() {
		assertEquals(true, thestral.getTrainedForPullingCarriage());
	}

	@Test
	public void canToggleTrainingForCarriage_turnsFalse() {
		thestral.toggleTrainedForPullingCarriage();
		assertEquals(false, thestral.getTrainedForPullingCarriage());
	} 

	@Test
	public void canToggleTrainingForCarriage_turnsTrue() {
		thestral2.toggleTrainedForPullingCarriage();
		assertEquals(true, thestral2.getTrainedForPullingCarriage());
	} 

	@Test
	public void canGraze() {
		assertEquals("Pontius grazes happily.", thestral.graze());
	}

	@Test
	public void canPullCarriage() {
		assertEquals("Pontius is ready to pull this carriage.", thestral.pullCarriage());
	}

	@Test
	public void cannotPullCarriage() {
		assertEquals("Pilatus doesn't understand what you want from him with this carriage.", thestral2.pullCarriage());
	}

	@Test
	public void isVisible() {
		assertEquals("You can see Pontius", thestral.visible("01:45"));
	}
}