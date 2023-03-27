import java.util.ArrayList;

/*
 * 
 */
public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  /*
   * 
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address,nFloors);
    System.out.println("You have built a house: 🏠");
    this.residents =new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
  }

  /*
   * 
   */
  public String toString(){
    String description = super.toString();
    description +=" There are currently "+this.residents.size()+ " residents in this house. This house";
    if (this.hasDiningRoom){
      description+= " has";
    }else{
      description+= "does not have ";
    }
    description+= " a dining room.";

    return description;
  }

  /*
   * 
   */
  public boolean hasDiningRoom(){
    if (hasDiningRoom){
      return true;
    } else{
      return false;
    }
  }

  /*
   * 
   */
  public int nResidents(){
    return residents.size();
  }

  /*
   * 
   */
  public void moveIn(String name){
    if (!residents.contains(name)){
      residents.add(name);
    } else{
      System.out.println("put in error here?");
    }
  }

  /*
   * 
   */
  public String moveOut(String name){
    if (residents.contains(name)){
      residents.remove(name);
      return name;
    } else{
      System.out.println("put in error here?");
      return name;
    }
  }

  /*
   * 
   */
  public boolean isResident(String person){
    if (residents.contains(person)){
      return true; 
    } else{
      return false;
    }
  }


  public static void main(String[] args) {
    House northrop= new House("Northrop","49 Elm Street", 4, true);
    System.out.println(northrop);
    northrop.moveIn("Tessa");
    System.out.println(northrop);
    northrop.moveOut("Tessa");
    System.out.println(northrop);
  }

}

