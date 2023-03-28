/* 
 * 
 */
public class Cafe extends Building{
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    /*
     * 
     */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces=100;
        this.nSugarPackets=100;
        this.nCreams=50;
        this.nCups=100;
    }

    /*
     * 
     */
    private void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces<size){
            System.out.println("Not enough coffee, restocking now.");
            this.restock(50,0,0,0);
        } 
        if (this.nSugarPackets<nSugarPackets){
            System.out.println("Not enough sugar packets, restocking now.");
            this.restock(0,50,0,0);

        }
        if (this.nCreams<nCreams){
            System.out.println("Not enough creams, restocking now.");
            this.restock(0,0,25,0);
        }
        if (this.nCups<1){
            System.out.println("Not enough cups, restocking now.");
            this.restock(0,0,0,50);
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -=1; 
    }

    /*
     * 
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    
    public static void main(String[] args) {
    
    }
    
}
