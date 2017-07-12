package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.animals.Niffler;

public class NifflerTest {
  Niffler niffler;

  @Before
  public void before() {
    niffler = new Niffler("Quack", "2007-07-07", 120, true, 9);
  }

//Generic Animal Tests are tested in Hydra.java
//Special Niffler Tests
    @Test
    public void howManyStolenItems() {
      assertEquals(120, niffler.getNumberOfStolenItems());
    }

    @Test
    public void canStealItems() {
      assertEquals(130, niffler.stealItems(10));
    }
   
    @Test
    public void canFindTreasure() {
      assertEquals(130, niffler.findTreasure(10, new Random(3)));
    }
    
    @Test
    public void cannotFindTreasure() {
      assertEquals(120, niffler.findTreasure(10, new Random(1000000000)));
    }

     @Test
     public void canDig() {
       assertEquals(130, niffler.dig(10, new Random(3)));
     }

}