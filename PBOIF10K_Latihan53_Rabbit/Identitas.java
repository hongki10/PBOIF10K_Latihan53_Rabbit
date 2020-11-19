/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Rabbit
 */

public class Rabbit extends Animal {
    private String color, name;
    
    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.name = name;
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getName() {
        return name;
    }
}
