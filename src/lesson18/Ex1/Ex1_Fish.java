package lesson18.Ex1;

public class Ex1_Fish extends Ex1_Animal {
    private String color;
    private String food;

    //constructors
    public Ex1_Fish(String name, String species, float hight, float weight, String habitat, String reproduction,
                String color, String food) {
        super(name, species, hight, weight, habitat, reproduction);
        this.color = color;
        this.food = food;
    }
}
