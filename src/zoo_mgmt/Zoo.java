package zoo_mgmt;
import java.util.ArrayList;

public class Zoo {
  private String name;
  private ArrayList<Enclosure> enclosures;
  //private ArrayList<Animal> allAnimals;

  public Zoo(String name) {
    this.name = name;
    this.enclosures = new ArrayList<Enclosure>();
    //this.allAnimals = new ArrayList<Animal>();
  }


//GETTERS
  public String getName() {
    return this.name;
  }

  public int enclosureCount() {
    return this.enclosures.size();
  }

  public void addEnclosure(Enclosure enclosure) {
    this.enclosures.add(enclosure);
  }

  public void removeEnclosure(Enclosure enclosure) {
    this.enclosures.remove(enclosure);
  }

}
