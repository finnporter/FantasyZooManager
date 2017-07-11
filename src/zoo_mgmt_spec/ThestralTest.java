package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.animals.Thestral;

public class ThestralTest {
  Thestral thestral;

  @Before
  public void before() {
    thestral = new Thestral("Pontius", "1995-11-30", true, true, 10);
  }

//Generic Animal Tests are tested in Hydra.java
//Special Thestral Tests
    @Test
    public void isTrainedForPullingCarriage() {
      assertEquals(true, thestral.getTrainedForPullingCarriage());
    }

    @Test
    public void canToggleTrainingForCarriage() {
      thestral.toggleTrainedForPullingCarriage();
      assertEquals(false, thestral.getTrainedForPullingCarriage());
    }

    @Test
    public void canGraze() {
      assertEquals("Pontius grazes happily.", thestral.graze());
    }

    @Test
    public void canPullCarriage() {
      assertEquals("Pontius is ready to pull this carriage.", thestral.pullCarriage());
    }
}