package zoo_mgmt.animals;

import zoo_mgmt.Animal;
import zoo_mgmt.AnimalType;
import zoo_mgmt.TemporalSpecialisation;

public class Hydra extends Animal{
  protected int numberOfHeads;
  private String colour;

  public Hydra(String name, String bday, int numberOfHeads, String colour,
		  boolean inEnclosure, int levelOfFood) {
    super(name, bday, 120, TemporalSpecialisation.DIURNAL, 8, true, AnimalType.SWIMMABLE, inEnclosure, levelOfFood);
    this.numberOfHeads = numberOfHeads;
    this.colour = colour;
  }

//GETTERS
  public int getNumberOfHeads() {
    return this.numberOfHeads;
  }

  public String getColour() {
    return this.colour;
  }

//OTHER METHODS
  public String swim() {
    return "paddle paddle";
  }

  public int regenerateHead() {
    return this.numberOfHeads += 1;
  }

}