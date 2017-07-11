package zoo_mgmt.animals;
import zoo_mgmt.Animal;
import zoo_mgmt.TemporalSpecialisation;
import zoo_mgmt.AnimalType;

public class Unicorn extends Animal {
  private String hairColour;
  private int glamFactor;
  private int hornLength;

  public Unicorn(String name, String bday, String hairColour, int glamFactor, int hornLength, boolean inEnclosure, int levelOfFood) {
    super(name, bday, 35, TemporalSpecialisation.NOCTURNAL, 5, false, AnimalType.GENERIC, inEnclosure, levelOfFood);
    this.hairColour = hairColour;
    this.glamFactor = glamFactor;
    this.hornLength = hornLength;
  }


//GETTERS
  public String getHairColour() {
    return this.hairColour;
  }

  public int getGlamFactor() {
    return this.glamFactor;
  }

  public int getHornLength() {
    return this.hornLength;
  }

//SPECIAL UNICORN FUNCTIONS
  public String glitter() {
    return this.name + " glitters brighter than the sun.";
  }
}