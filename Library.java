import java.util.Hashtable;

/*
 * 
 */
public class Library extends Building{

    private Hashtable <String, Boolean> collection;

    /*
     * 
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String,Boolean>(); 
    }

    /*
     * 
     */
    public void addTitle(String title){
      if(this.collection.contains(title)){
        throw new RuntimeException(this.name+" library already owns "+title+"."); 
      } else{
        this.collection.put(title,true);
        System.out.println(title+" has been added to "+this.name+" library and is ready to be checked out.");
      }
    }

    /*
     * 
     */
    public String removeTitle(String title){
      if (!this.collection.contains(title)){
        throw new RuntimeException(this.name+ " library does not own "+title+".");
      }else{
        this.collection.remove(title);
        System.out.println(title+" has been removed from "+this.name+" library.");
        return title;
      }
    }

    /*
     * 
     */
    public void checkOut(String title){
      if (containsTitle(title)){
        if (isAvailable(title)){
          this.collection.replace(title, false);
          System.out.println(title+" is checked out.");
        }
        else{
          throw new RuntimeException(this.name+" is already checked out.");
        }
      } else{
        throw new RuntimeException(this.name+" doesn't own "+title);
      }
    }

    /*
     * 
     */
    public void returnBook(String title){
      if (containsTitle(title)){
        if (!isAvailable(title)){
          this.collection.replace(title,true);
          System.out.println(title+" is returned.");
        } else{
          throw new RuntimeException(title+" has not been checked out.");
        }
      } else{
        throw new RuntimeException(this.name+" doesn't own "+title);
      }
    }

    /*
     * 
     */
    public boolean containsTitle(String title){
      if (this.collection.contains(title)){
        return true;
      } else {
        return false;
      }
    }

    /*
     * 
     */
    public boolean isAvailable(String title){
      if(this.collection.get(title)){
        return true;
      }else{
        return false;
      }
    }

    /*
     * 
     */
    public void printCollection(){
      String toPrint="";
      toPrint+=this.collection.toString();
      toPrint.replace("true","Available");
      toPrint.replace("false","Checked Out");
    }
  
    public static void main(String[] args) {
      //create a library 
      Library neilson= new Library("Neilson", "7 Neilson Drive", 4);
      //add a book 
      neilson.addTitle("Charlotte's Web");
      //check book is in collection 
      neilson.printCollection();
      //add another book 
      neilson.addTitle("Harry Potter and the Sorcerer's Stone");
      neilson.printCollection();
      //try to check out a book 
      neilson.checkOut("Charlotte's Web");
      neilson.printCollection();
      neilson.returnBook("Charlotte's Web");


      
    }
  
  }