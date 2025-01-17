import java.util.ArrayList;

/*
 * House class has a constructor; accessors; and moveIn, moveOut, and toString methods. 
 */
public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  /*
   * House constructor 
   * @param: String name, String address, int nFloors, boolean hasDining Room 
   * @returns: House 
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
  }

  /** Accessor for hasDiningRoom */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /** Accessor for number of residents */
  public int nResidents() {
    return this.residents.size();
  }

  /** Method to add resident to House if they are not already 
   * @param: name 
  */
  public void moveIn(String name) {
    // check if this.residents contains name
    if (this.isResident(name)) {
      //   if so: throw and exception
      throw new RuntimeException(name + " is already a resident of " + this.name);
    }
    // if we're good to go, add to roster
    this.residents.add(name);
    System.out.println(name + " has just moved into " + this.name + "! Go say hello :-)");
  }

  /** Method to remove resident from House if they are a resident
   * @param: name 
   */
  public String moveOut(String name){
    if (this.isResident(name)){
      residents.remove(name);
      System.out.println(name+ " has just moved out of "+this.name+".");
      return name;
  } else{
    throw new RuntimeException(name+" is not a resident of "+this.name);
  }
}
 /*
  * Method to check if a person is a resident
  * @param: person 
  * @returns: T/F
  */
  public boolean isResident(String person){
    if (residents.contains(person)){
      return true;
    }else{
      return false;
    }
  }


  /** Converts House to string  
   * returns: String
  */
  public String toString() {
    String description = super.toString();
    description += " There are currently " + this.nResidents() + " people living in this house.";
    description += " This house ";
    if (this.hasDiningRoom) {
      description += "has";
    } else {
      description += "does not have";
    }
    description += " an active dining room.";
    return description;
  }

  
  public static void main(String[] args) {
    House morrow = new House("Morrow", "The Quad", 4, false);
    System.out.println(morrow);
    morrow.moveIn("Jordan");
    morrow.moveOut("Jordan");
    System.out.println(morrow);
    House king = new House("King", "The Quad", 3, true);
    System.out.println(king);

  }

}