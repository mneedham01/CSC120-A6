import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address,nFloors);
    System.out.println("You have built a house: 🏠");
    this.residents =new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
  }

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

  public static void main(String[] args) {
    House northrop= new House("Northrop","49 Elm Street", 4, true);
    System.out.println(northrop);
  }

}

