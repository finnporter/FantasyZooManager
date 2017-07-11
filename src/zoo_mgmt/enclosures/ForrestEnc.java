package zoo_mgmt.enclosures;
import zoo_mgmt.Animal;
import zoo_mgmt.AnimalType;
import zoo_mgmt.EncType;
import zoo_mgmt.Enclosure;

public class ForrestEnc extends Enclosure {

  public ForrestEnc(String name, boolean functional, double size) {
    super(name, functional, size, EncType.FORREST);
  }
  
  public void addAnimal(Animal newAnimal) {
	   if(newAnimal.getAnimalType() == AnimalType.GENERIC){
	      animals.add(newAnimal); 
	    }
	  }	
	  
	  public void removeAnimal(Animal animal) {
		    animals.remove(animal);
		  }

}