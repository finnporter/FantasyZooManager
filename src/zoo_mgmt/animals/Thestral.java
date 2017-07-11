package zoo_mgmt.animals;
import zoo_mgmt.Animal;
import zoo_mgmt.TemporalSpecialisation;
import zoo_mgmt.AnimalType;

public class Thestral extends Animal {
  protected boolean trainedForPullingCarriage;

  public Thestral(String name, String bday, boolean trainedForPullingCarriage, boolean inEnclosure, int levelOfFood) {
    super(name, bday, 35, TemporalSpecialisation.NOCTURNAL, 3, false, AnimalType.GENERIC, inEnclosure, levelOfFood);
    this.trainedForPullingCarriage = trainedForPullingCarriage;
  }


//GETTERS
  public boolean getTrainedForPullingCarriage() {
    return this.trainedForPullingCarriage;
  }

//SETTERS, of sorts
  public void toggleTrainedForPullingCarriage() {
    this.trainedForPullingCarriage = !this.trainedForPullingCarriage;
  }

//OTHER THESTRAL FUNCITIONS
  public String graze() {
    return this.name + " grazes happily.";
  }

  public String pullCarriage() {
    if (this.trainedForPullingCarriage == true) {
      return this.name + " is ready to pull this carriage.";
    }
    else {
      return this.name + " doesn't understand what you want from him with this carriage.";
    }
  }
}