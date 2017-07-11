package zoo_mgmt;
import java.util.ArrayList;

public abstract class Enclosure {
  private String name;
  private boolean functional;
  private double size;
  private EncType type;
  protected ArrayList<Animal> animals;

  public Enclosure(String name, boolean functional, double size, EncType type) {
    this.name = name;
    this.functional = functional;
    this.size = size;
    this.type = type;
    this.animals = new ArrayList<Animal>();
  }


//GETTERS
  public String getName(){
    return this.name;
  }

  public boolean getFuctionalStatus() {
    return this.functional;
  }

  public double getSize() {
    return this.size;
  }

  public EncType getType() {
    return this.type;
  }

//ENCLOSURE FUNCTIONS
  public int countAnimals() {
    return this.animals.size();
  }

  public void addAnimal(Animal animal) {
    //will force add animal
    animals.add(animal);
  }

  public void removeAnimal(Animal animal) {
    animals.remove(animal);
  }

  public boolean checkSize(Animal animal) {
    //checks if the animal fits into the intended enclosure
    if (animal.sizeRequirement <= this.size) {
      return true;
    }
    else {
      return false;
    }
  }

  public boolean checkDangerLevel(Animal newAnimal) {
    //checks for existing animals and compatible danger levels
    for (Animal animal : animals) {
      if (newAnimal.levelOfDanger == animal.levelOfDanger) {
      }
      else
        return false;
    }
    return true;
  }

  public String safelyAddAnimal(Animal newAnimal) {
    if (checkSize(newAnimal) == true && checkDangerLevel(newAnimal) == true) {
      addAnimal(newAnimal);
      return "Animal added.";
    }
    else
      return "Sorry, can't add animal.";
  }


}