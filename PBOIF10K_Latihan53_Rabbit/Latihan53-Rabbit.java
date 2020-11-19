/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Rabbit
 */
 
public class Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        
        System.out.println("Hello, His name is " + rabbit.getName());
        System.out.println("Peter is Vegetarian? " + rabbit.isVegetarian());
        System.out.println("Peter eats " + rabbit.getEats());
        System.out.println("Peter has " + rabbit.getNoOfLegs() + " legs");
        System.out.println("Peter color is " + rabbit.getColor());
    }
    
}